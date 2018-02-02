package Business;

import Business.Account.UserAccountDirectory;
import Business.Compound.CompoundHistory;
import Business.Disease.Disease;
import Business.Drug.DrugHistory;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Study.StudyHistory;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private ArrayList<Disease> diseaseList;
    
  //  private DiseaseHistory diseaseHistory;
    private UserAccountDirectory userAccountDirectory;
    private CompoundHistory compoundHistory;
    private DrugHistory drugHistory;
    private StudyHistory studyHistory;
    private EnterpriseDirectory enterpriseDirectoory;
    private OrganizationDirectory organizationDirectory;
    private PersonDirectory personDirectory;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        diseaseList=new ArrayList<Disease>();
        
        userAccountDirectory=new UserAccountDirectory();
      //  diseaseHistory=new DiseaseHistory();
        compoundHistory=new CompoundHistory();
        drugHistory=new DrugHistory();
        studyHistory=new StudyHistory();
        enterpriseDirectoory=new EnterpriseDirectory();
        organizationDirectory=new OrganizationDirectory();
        personDirectory=new PersonDirectory();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public ArrayList<Disease> getDiseaseList() {
        return diseaseList;
    }
    
    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public Disease addDisease(){
        Disease d=new Disease();
        diseaseList.add(d);
        return d;
    }
    
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }
        return true;
    }

//    public DiseaseHistory getDiseaseHistory() {
//        return diseaseHistory;
//    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public CompoundHistory getCompoundHistory() {
        return compoundHistory;
    }

    public DrugHistory getDrugHistory() {
        return drugHistory;
    }

    public StudyHistory getStudyHistory() {
        return studyHistory;
    }

    public EnterpriseDirectory getEnterpriseDirectoory() {
        return enterpriseDirectoory;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }
    
    
    
}
