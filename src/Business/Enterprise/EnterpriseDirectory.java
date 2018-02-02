/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author xss
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<>();
    }
     public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.HospitalAdmin){
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.SupplierAdmin){
            enterprise = new SupplierEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.ManufactureAdmin){
            enterprise = new ManufactureEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    public void deleteEnterprise(Enterprise e){
        enterpriseList.remove(e);
    }
}
