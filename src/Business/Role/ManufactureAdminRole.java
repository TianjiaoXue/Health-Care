/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.Account.UserAccount;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import UserInterface.ManufactureRoleAdmin.ManufactureAdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.ManufactureRole.ManufactureWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class ManufactureAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization,
            Enterprise enterprise, Business.EcoSystem business) {
        return new ManufactureAdminWorkAreaJPanel( userProcessContainer, enterprise);
    }

    
    
}
