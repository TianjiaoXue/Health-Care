/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Person.PersonDirectory;


/**
 *
 * @author raunak
 */
public abstract class Enterprise extends Organization{

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private PersonDirectory pd;
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        pd=new PersonDirectory();
    }
    
    public enum EnterpriseType{
        HospitalAdmin("HospitalAdmin"),
        SupplierAdmin("SupplierAdmin"),
        ManufactureAdmin("ManufactureAdmin");
       
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public PersonDirectory getPd() {
        return pd;
    }

    public void setPd(PersonDirectory pd) {
        this.pd = pd;
    }
    

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

}
