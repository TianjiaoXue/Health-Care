/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Account.UserAccountDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    public enum Type{
        Admin("Admin Organization"), 
        Doctor("Doctor Organization"),
        Researcher("Researcher Organization"),
        Supplier("Supplier Organization"),
        SupplierAdmin("SupplierAdmin Organization"),
        Manufacture("Manufacture Organization"),
        ManufactureAdmin("ManufactureAdmin Organization"),
        Hospital("Hospital Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
