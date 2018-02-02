/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.Account.UserAccount;
import Business.Enterprise.Enterprise;
import Business.Organization.ManufactureOrganization;
import Business.Organization.Organization;
import UserInterface.Admin.AdminWorkAreaPanel;
import UserInterface.HospitalAdmin.HospitalAdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.ManufactureRole.ManufactureWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class ManufactureRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization,
            Enterprise enterprise,Business.EcoSystem system) {
        return new ManufactureWorkAreaJPanel(userProcessContainer, account, (ManufactureOrganization) organization,enterprise,system);
    }
    
}
