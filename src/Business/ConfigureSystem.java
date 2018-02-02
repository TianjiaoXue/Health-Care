package Business;


import Business.Account.UserAccount;
import Business.Person.Person;
import Business.Role.SystemAdminRole;


/**
 *
 * @author rrheg
 */
public class ConfigureSystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Person employee = system.getPersonDirectory().createPerson("xss");
        
        UserAccount ua = system.getUserAccountDirectory().addUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
