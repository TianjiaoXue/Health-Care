/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Study;

import Business.Disease.Disease;
import Business.EcoSystem;




/**
 *
 * @author xss
 */
public class Study {
    private String studyName;
    private String studyNumber;
    private String studyGene;
    private String researcher;

    private EcoSystem s;
    public String getStudyName() {
        return studyName;
    }

    public void setStudyName(String studyName) {
        this.studyName = studyName;
    }

    public String getStudyNumber() {
        return studyNumber;
    }

    public void setStudyNumber(String studyNumber) {
        this.studyNumber = studyNumber;
    }



    public String getStudyGene() {
        return studyGene;
    }

    public void setStudyGene(String studyGene) {
        this.studyGene = studyGene;
    }

    public String getResearcher() {
        return researcher;
    }

    public void setResearcher(String researcher) {
        this.researcher = researcher;
    }


    public EcoSystem getS() {
        return s;
    }
  
    public String toString(){
        return studyName;
    }
}
