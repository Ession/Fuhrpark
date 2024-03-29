/* Copyright (c) 2001-2005, The HSQL Development Group
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * Neither the name of the HSQL Development Group nor the names of its
 * contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL HSQL DEVELOPMENT GROUP, HSQLDB.ORG,
 * OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package de.fhswf.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase
{

    Connection conn; // our connnection to the db - presist for life of program

    // we dont want this garbage collected until we are done
    public DataBase(String db_file_name_prefix) throws Exception
    {
        // Load the HSQL Database Engine JDBC driver
        // hsqldb.jar should be in the class path or made part of the current
        // jar
        Class.forName("org.hsqldb.jdbcDriver");

        // connect to the database. This will load the db files and start the
        // database if it is not alread running.
        // db_file_name_prefix is used to open or create files that hold the
        // state
        // of the db.
        // It can contain directory names relative to the
        // current working directory
        conn = DriverManager.getConnection(
                "jdbc:hsqldb:" + db_file_name_prefix, // filenames
                "sa", // username
                ""); // password
    }

    public void shutdown() throws SQLException
    {

        Statement st = conn.createStatement();

        // db writes out to files and performs clean shuts down
        // otherwise there will be an unclean shutdown
        // when program ends
        st.execute("SHUTDOWN");
        conn.close(); // if there are no other open connection
    }

    // use for SQL command SELECT
    public synchronized void dumpQuery(String expression) throws SQLException
    {

        Statement st = null;
        ResultSet rs = null;

        st = conn.createStatement(); // statement objects can be reused with

        // repeated calls to execute but we
        // choose to make a new one each time
        rs = st.executeQuery(expression); // run the query

        // do something with the result set.
        dump(rs);
        st.close(); // NOTE!! if you close a statement the associated ResultSet
        // is

        // closed too
        // so you should copy the contents to some other object.
        // the result set is invalidated also if you recycle an Statement
        // and try to execute some other query before the result set has been
        // completely examined.
    }

    /**
     * Runs a query and retruns the ResultSet
     *
     * @param expression
     *            SQL-Expression
     * @return the ResultSet retruned by the Statement
     * @throws SQLException
     */
    public synchronized ResultSet query(String expression)
            throws SQLException
    {

        Statement st = null;

        st = conn.createStatement(); // statement objects can be reused with

        // repeated calls to execute but we
        // choose to make a new one each time
        return st.executeQuery(expression); // run the query
    }

    // use for SQL commands CREATE, DROP, INSERT and UPDATE
    public synchronized void update(String expression) throws SQLException
    {

        Statement st = null;

        st = conn.createStatement(); // statements

        int i = st.executeUpdate(expression); // run the query

        if (i == -1)
        {
            System.out.println("db error : " + expression);
        }

        st.close();
    } // void update()

    public static void dump(ResultSet rs) throws SQLException
    {

        // the order of the rows in a cursor
        // are implementation dependent unless you use the SQL ORDER statement
        ResultSetMetaData meta = rs.getMetaData();
        int colmax = meta.getColumnCount();
        int i;
        Object o = null;

        // the result set is a cursor into the data. You can only
        // point to one row at a time
        // assume we are pointing to BEFORE the first row
        // rs.next() points to next row and returns true
        // or false if there is no next row, which breaks the loop
        for (; rs.next();)
        {
            for (i = 0; i < colmax; ++i)
            {
                o = rs.getObject(i + 1); // Is SQL the first column is indexed

                // with 1 not 0
                System.out.print(o.toString() + " ");
            }

            System.out.println(" ");
        }
    } // void dump( ResultSet rs )
} // class Testdb