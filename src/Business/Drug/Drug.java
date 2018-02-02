/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;
import Business.Compound.CompoundHistory;

/**
 *
 * @author xss
 */
public class Drug {
    private String drugNumber;
    private String drugName;
    private String manufacture;
    private String use;
    private String description;
    private CompoundHistory compoundList;

    public Drug(){
        compoundList=new CompoundHistory();
    }
    public String getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(String drugNumber) {
        this.drugNumber = drugNumber;
    }

    

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public CompoundHistory getCompoundList() {
        return compoundList;
    }

    public void setCompoundList(CompoundHistory compoundList) {
        this.compoundList = compoundList;
    }
    
    
        public String toString(){
        return drugName;
    }
}
