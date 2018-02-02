/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.Account.UserAccount;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import UserInterface.Admin.AdminWorkAreaPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization,
            Enterprise enterprise,Business.EcoSystem system) {
        return new AdminWorkAreaPanel(userProcessContainer, system);
    }
    
}
