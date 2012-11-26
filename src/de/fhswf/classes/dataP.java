package de.fhswf.classes;

import de.fhswf.db.DataBase;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dataP
{

    private static final String DataBaseFileName = "FuhrparkP";
    private static final File DataBaseFile = new File(DataBaseFileName + ".script");
    private DataBase dataBase;

    private void initDataBase()
    {
        Boolean exists = DataBaseFile.isFile();
        try
        {
            dataBase = new DataBase(DataBaseFileName);
            if (!exists)
            {
                update(
                        "CREATE TABLE fahrer("
                        + "fahrer_name VARCHAR(100) UNIQUE,"
                        + "fahrer_fuehrerscheinklasse VARCHAR(30), "
                        + "fahrer_fuehrerscheinseit VARCHAR(30), "
                        + "fahrer_fahrzeug1 VARCHAR(30), "
                        + "fahrer_fahrzeug2 VARCHAR(30), "
                        + "fahrer_fahrzeug3 VARCHAR(30), "
                        + ")");

                update(
                        "CREATE TABLE fahrzeug("
                        + "fahrzeug_kennzeichen VARCHAR(30) UNIQUE, "
                        + "fahrzeug_erstzulassung  VARCHAR(30), "
                        + ")");

                update("INSERT INTO fahrer(fahrer_name, fahrer_fuehrerscheinklasse, fahrer_fuehrerscheinseit, fahrer_fahrzeug1) VALUES('Mathias Jost','B','1912','MK-CH-5558')");
                update("INSERT INTO fahrer(fahrer_name, fahrer_fuehrerscheinklasse, fahrer_fuehrerscheinseit, fahrer_fahrzeug1, fahrer_fahrzeug2) VALUES('Lars Thevissen','B','1910','LE-ET-1337','LE-ET-1339')");

                update("INSERT INTO fahrzeug(fahrzeug_kennzeichen, fahrzeug_erstzulassung) VALUES('MK-CH-5558','1936')");
                update("INSERT INTO fahrzeug(fahrzeug_kennzeichen, fahrzeug_erstzulassung) VALUES('LE-ET-1337','1337')");
                update("INSERT INTO fahrzeug(fahrzeug_kennzeichen, fahrzeug_erstzulassung) VALUES('LE-ET-1339','2015')");
           }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void update(String expression)
    {
        if (dataBase == null)
        {
            throw new IllegalAccessError("Bitte erst initDataBase() ausfuehren");
        }
        try
        {
            this.dataBase.update(expression);
        }
        catch (SQLException e)
        {
            System.out.println("Fehler in folgendem Statement:");
            System.out.println(expression);
            e.printStackTrace();
        }
    }

    public void shutdown()
    {
        try
        {
            dataBase.shutdown();
        }
        catch (SQLException e)
        {
            System.out.println("Fehler beim Beenden der Datenbank:");
            e.printStackTrace();
        }
    }

    public dataP()
    {
        initDataBase();
    }
    
    public void saveNewFahrzeug(Fahrzeug a)
    {
        String query = "INSERT INTO fahrzeug(fahrzeug_kennzeichen, fahrzeug_erstzulassung) VALUES(";
        query += "'" + a.getKennzeichen() + "',";
        query += "'" + a.getErstzulassung() + "'";
        query += ")";
        try
        {
            dataBase.update(query);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(dataP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void saveNewFahrer(Fahrer a)
    {
        String query = "INSERT INTO fahrer(fahrer_name, fahrer_fuehrerscheinklasse, fahrer_fuehrerscheinseit, fahrer_fahrzeug1, fahrer_fahrzeug2, fahrer_fahrzeug3) VALUES(";
        query += "'" + a.getName() + "',";
        query += "'" + a.getFuehrerscheinklasse() + "',";
        query += "'" + a.getFeuhrerscheinSeit()+ "',";
        query += "'" + a.getFahrzeug1() + "',";
        query += "'" + a.getFahrzeug2() + "',";
        query += "'" + a.getFahrzeug3() + "'";
        query += ")";
        try
        {
            dataBase.update(query);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(dataP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public Fahrzeug getFahrzeug(String kennzeichen)
    {

        try
        {
            ResultSet rs = dataBase.query("Select * from fahrzeug where fahrzeug_kennzeichen  = '" + kennzeichen + "'");
            if (rs.next())
            {
                return new Fahrzeug(rs.getString("fahrzeug_kennzeichen"), rs.getString("fahrzeug_erstzulassung"));
            }
            else
            {
                System.out.println("test");
                return null;
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(dataP.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
    public Vector<Fahrzeug> getFahrzeug()
    {
        Vector<Fahrzeug> vFahrzeug = new Vector<Fahrzeug>();
        try
        {
            ResultSet rs = dataBase.query("Select * from fahrzeug order by fahrzeug_kennzeichen");

            while (rs.next())
            {
                vFahrzeug.add(new Fahrzeug(rs.getString("fahrzeug_kennzeichen"), rs.getString("fahrzeug_erstzulassung")));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(dataP.class.getName()).log(Level.SEVERE, null, ex);
        }

        return vFahrzeug;
    }
    
    public model getFahrzeugModel()
    {
        Vector tabellenVector = new Vector();
        Vector header = new Vector();

        for (Enumeration<Fahrzeug> eo = this.getFahrzeug().elements(); eo.hasMoreElements();)
        {
            Vector<String> zeilenVector = new Vector<String>();
            Fahrzeug o = eo.nextElement();
            zeilenVector.add(o.getKennzeichen());
            zeilenVector.add(o.getErstzulassung());
            tabellenVector.add(zeilenVector);
        }
        header.add("Kennzeichen");
        header.add("Erstzulassung");
        return new model(tabellenVector, header);

    }
   
    public Fahrer getFahrer(String name)
    {

        try
        {
            ResultSet rs = dataBase.query("Select * from fahrer where fahrer_name  = '" + name + "'");
            if (rs.next())
            {
                return new Fahrer(rs.getString("fahrer_name"), rs.getString("fahrer_fuehrerscheinklasse"), rs.getString("fahrer_fuehrerscheinseit"), rs.getString("fahrer_fahrzeug1"), rs.getString("fahrer_fahrzeug2"), rs.getString("fahrer_fahrzeug3"));
            }
            else
            {
                System.out.println("test");
                return null;
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(dataP.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
    public Vector<Fahrer> getFahrer()
    {
        Vector<Fahrer> vFahrer = new Vector<Fahrer>();
        try
        {
            ResultSet rs = dataBase.query("Select * from fahrer order by fahrer_name");

            while (rs.next())
            {
                vFahrer.add(new Fahrer(rs.getString("fahrer_name"), rs.getString("fahrer_fuehrerscheinklasse"), rs.getString("fahrer_fuehrerscheinseit"), rs.getString("fahrer_fahrzeug1"), rs.getString("fahrer_fahrzeug2"), rs.getString("fahrer_fahrzeug3")));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(dataP.class.getName()).log(Level.SEVERE, null, ex);
        }

        return vFahrer;
    }
    
    public model getFahrerModel()
    {
        Vector tabellenVector = new Vector();
        Vector header = new Vector();

        for (Enumeration<Fahrer> eo = this.getFahrer().elements(); eo.hasMoreElements();)
        {
            Vector<String> zeilenVector = new Vector<String>();
            Fahrer o = eo.nextElement();
            zeilenVector.add(o.getName());
            zeilenVector.add(o.getFuehrerscheinklasse());
            zeilenVector.add(o.getFeuhrerscheinSeit());
            zeilenVector.add(o.getFahrzeug1());
            zeilenVector.add(o.getFahrzeug2());
            zeilenVector.add(o.getFahrzeug3());
            tabellenVector.add(zeilenVector);
        }
        header.add("Name");
        header.add("Fuehrerscheinklasse");
        header.add("FuehrerscheinSeit");
        header.add("Fahrzeug 1");
        header.add("Fahrzeug 2");
        header.add("Fahrzeug 3");
        return new model(tabellenVector, header);

    }
}
