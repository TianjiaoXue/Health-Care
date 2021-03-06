/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package UserInterface.Supplier;

import Business.Account.UserAccount;
import Business.Compound.Compound;
import Business.Compound.CompoundHistory;
import Business.Disease.Disease;
import Business.Drug.Drug;
import Business.Enterprise.Enterprise;
import Business.Organization.SupplierOrganization;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class SupplierWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    private SupplierOrganization organization;
    private Enterprise enterprise;
    private UserAccount account;
    Business.EcoSystem s;
    /** Creates new form AdminWorkAreaJPanel */
    public SupplierWorkAreaJPanel(JPanel userProcessContainer,UserAccount account,SupplierOrganization organization,Enterprise enterprise,Business.EcoSystem s) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization=organization;
        this.account=account;
        this.enterprise=enterprise;
        this.s=s;
        valueLabel.setText(enterprise.getName());
        popComboBox();
    }
    
    public void popComboBox(){
        drugComboBox.removeAllItems();
        for(Disease d:s.getDiseaseList()){
                drugComboBox.addItem(d);
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
        manageCompoundJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        drugComboBox = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Supplier Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        manageCompoundJButton.setText("Manage Compound");
        manageCompoundJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCompoundJButtonActionPerformed(evt);
            }
        });
        add(manageCompoundJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 130, -1));

        drugComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(drugComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageCompoundJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCompoundJButtonActionPerformed

        Disease d=(Disease) drugComboBox.getSelectedItem();
        SupplierSelectAreaJPanel manageCompoundJPanel = new SupplierSelectAreaJPanel(userProcessContainer, d,account,s);
        userProcessContainer.add("manageCompoundJPanel", manageCompoundJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageCompoundJButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox drugComboBox;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageCompoundJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
