/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Account;

import Business.Compound.CompoundHistory;
import Business.Drug.DrugHistory;
import Business.Person.Person;
import Business.Role.Role;
import Business.Study.StudyHistory;

/**
 *
 * @author xss
 */
public class UserAccount {


    private String userName;
    private String password;
    private Role role;
    private Person person;
    private CompoundHistory ch;
    private DrugHistory drugHistory;
    private StudyHistory studyHistory;
    //private DiseaseHistory diseaseHistory;
    public UserAccount(){
        ch=new CompoundHistory();
        drugHistory=new DrugHistory();
      //  diseaseHistory=new DiseaseHistory();
        studyHistory=new StudyHistory();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public CompoundHistory getCh() {
        return ch;
    }

    public DrugHistory getDrugHistory() {
        return drugHistory;
    }

    public StudyHistory getStudyHistory() {
        return studyHistory;
    }

//    public DiseaseHistory getDiseaseHistory() {
//        return diseaseHistory;
//    }

    
    @Override
    public String toString(){
        return userName;
    }
}