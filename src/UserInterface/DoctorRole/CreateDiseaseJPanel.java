/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.Account.UserAccount;
import UserInterface.ManufactureRole.*;
import Business.Compound.Compound;
import Business.Compound.CompoundHistory;
import Business.Disease.Disease;
import Business.Drug.Drug;
import Business.Drug.DrugHistory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author xss
 */
public class CreateDiseaseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */

    UserAccount account;
    private JPanel userProcessContainer;
 Business.EcoSystem s;
    public CreateDiseaseJPanel(JPanel userProcessContainer,UserAccount account, Business.EcoSystem s) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.s=s;
        this.account=account;
       supplierTextField.setText(account.getUserName());
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        temperatureLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        supplierTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        titleLabel.setText("Create Disease");

        temperatureLabel.setText("Name");

        dateLabel.setText("Doctor");

        supplierTextField.setEnabled(false);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(262, 262, 262))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(temperatureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(supplierTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backJButton))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temperatureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        String name=nameTextField.getText();
        String doctorName=supplierTextField.getText();
        Disease disease=s.addDisease();
        //d.setCompoundList(c);

        disease.setDiseaseName(name);
        disease.setDoctorName(doctorName);
        
//        Disease disease1=account..addDisease();
        //d.setCompoundList(c);

//        disease1.setDiseaseName(name);
//        disease1.setDoctorName(doctorName);
//                ;       
        JOptionPane.showMessageDialog(null,"Disease Added Successfully");
        
        nameTextField.setText("");
        nameTextField.setText("");       

    }//GEN-LAST:event_saveButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[]componentArray=userProcessContainer.getComponents();
        Component component=componentArray[componentArray.length-1];
        ManageDiseaseJPanel manageDiseaseJPanel=(ManageDiseaseJPanel)component;
        manageDiseaseJPanel.populateTable();
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField supplierTextField;
    private javax.swing.JLabel temperatureLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
