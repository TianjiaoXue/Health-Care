/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.Account.UserAccount;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ResearcherOrganization;
import UserInterface.ResearcherRole.ResearcherWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ResearcherRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization,
            Enterprise enterprise,Business.EcoSystem business) {
        return new ResearcherWorkAreaJPanel(userProcessContainer, account, (ResearcherOrganization) organization, enterprise,business);
    }
    
}
