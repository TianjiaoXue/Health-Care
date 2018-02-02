/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;


import Business.Compound.Compound;
import Business.Drug.Drug;
import Business.Drug.DrugHistory;
import Business.Study.StudyHistory;

import java.util.ArrayList;

/**
 *
 * @author xss
 */
public class Disease {
    private String diseaseName;
    private String doctorName;
    private DrugHistory drugList;
    private StudyHistory studyList;
     public Disease(){
        drugList=new DrugHistory();
        studyList=new StudyHistory();
    }


    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }


    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

  

    public DrugHistory getDrugList() {
        return drugList;
    }

    public void setDrugList(DrugHistory drugList) {
        this.drugList = drugList;
    }

    public StudyHistory getStudyList() {
        return studyList;
    }

    public void setStudyList(StudyHistory studyList) {
        this.studyList = studyList;
    }

    
     public String toString(){
         return diseaseName;
     }
}
