/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.Account.UserAccount;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import UserInterface.Admin.AdminWorkAreaPanel;
import UserInterface.HospitalAdmin.HospitalAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class HospitalAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization,
            Enterprise enterprise,Business.EcoSystem system) {
        return new HospitalAdminWorkAreaJPanel(userProcessContainer, enterprise);
    }
    
}
