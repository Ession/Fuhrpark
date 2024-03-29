/*
 * FahrerWindow.java
 *
 * Created on 21.11.2012, 21:32:35
 */
package de.fhswf.forms;

import de.fhswf.classes.*;
import java.awt.Color;
import java.util.Enumeration;

/**
 *
 * @author dark
 */
public class FahrerWindow extends javax.swing.JFrame
{
	PrototypWindow parent;

	/** Creates new form FahrerWindow */
	public FahrerWindow(PrototypWindow _parent)
	{
		initComponents();
		this.updateCmb();
		parent = _parent;
	}

	/** Creates new form FahrerWindow */
	public FahrerWindow()
	{
		initComponents();
		this.updateCmb();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cmbFahrzeug3 = new javax.swing.JComboBox();
        javax.swing.JButton btnOK = new javax.swing.JButton();
        javax.swing.JButton btnCancel = new javax.swing.JButton();
        javax.swing.Box.Filler filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        txtFuehrerscheinklasse = new javax.swing.JTextField();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        txtFuehrerscheinSeit = new javax.swing.JTextField();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        cmbFahrzeug2 = new javax.swing.JComboBox();
        cmbFahrzeug1 = new javax.swing.JComboBox();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(345, 255));
        setResizable(false);

        jLabel1.setText("Name");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel3.setText("Fahrzeug 3");
        jLabel3.setName("jLabel3"); // NOI18N

        txtName.setName("txtName"); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        cmbFahrzeug3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFahrzeug3.setMinimumSize(new java.awt.Dimension(51, 20));
        cmbFahrzeug3.setName("cmbFahrzeug3"); // NOI18N

        btnOK.setText("OK");
        btnOK.setMaximumSize(new java.awt.Dimension(85, 23));
        btnOK.setMinimumSize(new java.awt.Dimension(85, 23));
        btnOK.setName("btnOK"); // NOI18N
        btnOK.setPreferredSize(new java.awt.Dimension(85, 23));
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCancel.setText("Abbrechen");
        btnCancel.setName("btnCancel"); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        filler1.setName("filler1"); // NOI18N

        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setText("Führerscheinklasse");
        jLabel5.setName("jLabel5"); // NOI18N

        txtFuehrerscheinklasse.setName("txtFuehrerscheinklasse"); // NOI18N
        txtFuehrerscheinklasse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFuehrerscheinklasseKeyTyped(evt);
            }
        });

        jLabel2.setText("Ausstelldatum");
        jLabel2.setName("jLabel2"); // NOI18N

        txtFuehrerscheinSeit.setName("txtFuehrerscheinSeit"); // NOI18N
        txtFuehrerscheinSeit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFuehrerscheinSeitKeyTyped(evt);
            }
        });

        jLabel6.setText("Fahrzeug 2");
        jLabel6.setName("jLabel6"); // NOI18N

        cmbFahrzeug2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFahrzeug2.setMinimumSize(new java.awt.Dimension(51, 20));
        cmbFahrzeug2.setName("cmbFahrzeug2"); // NOI18N

        cmbFahrzeug1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFahrzeug1.setMinimumSize(new java.awt.Dimension(51, 20));
        cmbFahrzeug1.setName("cmbFahrzeug1"); // NOI18N

        jLabel7.setText("Fahrzeug 1");
        jLabel7.setName("jLabel7"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(txtFuehrerscheinklasse, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(txtFuehrerscheinSeit)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(30, 30, 30)
                                .addComponent(cmbFahrzeug1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(cmbFahrzeug3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(30, 30, 30)
                                .addComponent(cmbFahrzeug2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFuehrerscheinklasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFuehrerscheinSeit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbFahrzeug1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbFahrzeug2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbFahrzeug3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel))
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	public final void updateCmb()
	{
            cmbFahrzeug1.removeAllItems();
            cmbFahrzeug2.removeAllItems();
            cmbFahrzeug3.removeAllItems();
            dataP d = new dataP();

            cmbFahrzeug2.insertItemAt("", 0);
            cmbFahrzeug3.insertItemAt("", 0);

            for (Enumeration<Fahrzeug> eo = d.getFahrzeug().elements(); eo.hasMoreElements();)
            {
                    cmbFahrzeug1.addItem(eo.nextElement().getKennzeichen());
            }

            for (Enumeration<Fahrzeug> eo = d.getFahrzeug().elements(); eo.hasMoreElements();)
            {
                    cmbFahrzeug2.addItem(eo.nextElement().getKennzeichen());
            }

            for (Enumeration<Fahrzeug> eo = d.getFahrzeug().elements(); eo.hasMoreElements();)
            {
                    cmbFahrzeug3.addItem(eo.nextElement().getKennzeichen());
            }

            cmbFahrzeug1.setSelectedIndex(0);
            cmbFahrzeug2.setSelectedIndex(0);
            cmbFahrzeug3.setSelectedIndex(0);
	}

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOKActionPerformed
    {//GEN-HEADEREND:event_btnOKActionPerformed
        if (!txtName.getText().equals("") && !txtFuehrerscheinklasse.getText().equals("") && !txtFuehrerscheinSeit.getText().equals("") && txtName.getText().matches("^[A-z ]+$") && txtFuehrerscheinklasse.getText().matches("^[A-Z]{1,2}$") && txtFuehrerscheinSeit.getText().matches("^[0-9]{1,4}$"))
        {
            dataP d = new dataP();
            String Fahrzeug1 = cmbFahrzeug1.getSelectedItem().toString();
            String Fahrzeug2 = cmbFahrzeug2.getSelectedItem().toString();
            String Fahrzeug3 = cmbFahrzeug3.getSelectedItem().toString();
            
            Fahrer f = new Fahrer(txtName.getText(), txtFuehrerscheinklasse.getText(), txtFuehrerscheinSeit.getText(), Fahrzeug1, Fahrzeug2, Fahrzeug3);
            d.saveNewFahrer(f);
            parent.update();
            this.dispose();
        }
        else
        {
            Color lightred = new Color(255,102,102);
            
            if (txtName.getText().equals("") || !txtName.getText().matches("^[A-z ]+$"))
            {
                txtName.setBackground(lightred);
            }
            
            if (txtFuehrerscheinklasse.getText().equals("") || !txtFuehrerscheinklasse.getText().matches("^[A-Z]{1,2}$"))
            {
                txtFuehrerscheinklasse.setBackground(lightred);
            }
            
            if (txtFuehrerscheinSeit.getText().equals("") || !txtFuehrerscheinSeit.getText().matches("^[0-9]{1,4}$"))
            {
                txtFuehrerscheinSeit.setBackground(lightred);
            }
        }
    }//GEN-LAST:event_btnOKActionPerformed

	private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
	{//GEN-HEADEREND:event_btnCancelActionPerformed
		this.dispose();
	}//GEN-LAST:event_btnCancelActionPerformed

    private void txtFuehrerscheinSeitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFuehrerscheinSeitKeyTyped
        txtFuehrerscheinSeit.setBackground(Color.white);
    }//GEN-LAST:event_txtFuehrerscheinSeitKeyTyped

    private void txtFuehrerscheinklasseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFuehrerscheinklasseKeyTyped
        txtFuehrerscheinklasse.setBackground(Color.white);
    }//GEN-LAST:event_txtFuehrerscheinklasseKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        txtName.setBackground(Color.white);
    }//GEN-LAST:event_txtNameKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JComboBox cmbFahrzeug1;
    javax.swing.JComboBox cmbFahrzeug2;
    javax.swing.JComboBox cmbFahrzeug3;
    javax.swing.JTextField txtFuehrerscheinSeit;
    javax.swing.JTextField txtFuehrerscheinklasse;
    javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
