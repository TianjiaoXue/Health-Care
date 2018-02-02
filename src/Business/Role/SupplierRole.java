/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.Account.UserAccount;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import UserInterface.Admin.AdminWorkAreaPanel;
import javax.swing.JPanel;
import UserInterface.Supplier.SupplierWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class SupplierRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization,
            Enterprise enterprise,Business.EcoSystem system) {
        return new SupplierWorkAreaJPanel(userProcessContainer, account, (SupplierOrganization) organization,enterprise,system);
    }
    
}
