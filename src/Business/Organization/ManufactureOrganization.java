/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ManufactureAdminRole;
import Business.Role.ManufactureRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class ManufactureOrganization extends Organization{

    public ManufactureOrganization() {
        super(Type.Manufacture.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ManufactureRole());
        return roles;
    }
     
}
