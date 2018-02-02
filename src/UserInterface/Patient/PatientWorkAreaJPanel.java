/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package UserInterface.Patient;

import Business.Account.UserAccount;
import Business.Disease.Disease;
import Business.Enterprise.Enterprise;
import Business.Organization.SupplierOrganization;
import java.awt.CardLayout;
import javax.swing.JPanel;



/**
 *
 * @author  raunak
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Business.EcoSystem s;
    /** Creates new form AdminWorkAreaJPanel */
    public PatientWorkAreaJPanel(JPanel userProcessContainer,Business.EcoSystem s) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.s=s;
        
        diseaseComboBox.removeAllItems();
        for(Disease disease:s.getDiseaseList()){
            diseaseComboBox.addItem(disease);
        }
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        diseaseComboBox = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Patient Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        diseaseComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(diseaseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 330, 40));

        jButton1.setText("Go>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        jLabel2.setText("Select The Disease Which You Want to Understand");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 320, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Disease disease =(Disease) diseaseComboBox.getSelectedItem();
        DiseaseKnowledgeJPanel panel=new DiseaseKnowledgeJPanel(userProcessContainer,disease,s);
        userProcessContainer.add("DiseaseKnowledgeJPanel",panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox diseaseComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    
}
