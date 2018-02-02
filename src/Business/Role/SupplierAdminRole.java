/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.Account.UserAccount;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import UserInterface.SupplierAdmin.SupplierAdminWorkAreaJPanel;
import javax.swing.JPanel;
import UserInterface.Supplier.SupplierWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class SupplierAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization,
            Enterprise enterprise,Business.EcoSystem business) {
        return new SupplierAdminWorkAreaJPanel(userProcessContainer,enterprise);
    }

    
    
}
