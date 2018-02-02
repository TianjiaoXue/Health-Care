/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Compound;

import java.util.ArrayList;

/**
 *
 * @author xss
 */
public class CompoundHistory {
    private ArrayList<Compound> compoundList;
    public CompoundHistory(){
        this.compoundList=new ArrayList<Compound>();
    }

    public ArrayList<Compound> getCompoundList() {
        return compoundList;
    }

    public void setCompoundList(ArrayList<Compound> compoundList) {
        this.compoundList = compoundList;
    }
    
    
    
    public Compound addCompound(){
        Compound c=new Compound();
        compoundList.add(c);
        return c;
    }
    public void deleteCompound(Compound c){
        compoundList.remove(c);
    }
}
