/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Account;

import Business.Person.Person;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author xss
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount>userAccountList;
    public UserAccountDirectory() {
        userAccountList=new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUserName().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount addUserAccount(String username, String password, Person p,Role role){
        UserAccount ua=new UserAccount();
        ua.setUserName(username);
        ua.setPassword(password);
        ua.setPerson(p);
        ua.setRole(role);
        userAccountList.add(ua);
        return ua;
    }
    public void deleteUserAccount(UserAccount ua){
        userAccountList.remove(ua);
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUserName().equals(username))
                return false;
        }
        return true;
    }

}
