/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Study;

import java.util.ArrayList;

/**
 *
 * @author xss
 */
public class StudyHistory {
     private ArrayList<Study> studyList;
    public StudyHistory(){
        studyList=new ArrayList<Study>();
    }

    public ArrayList<Study> getStudyList() {
        return studyList;
    }

    public void setStudyList(ArrayList<Study> studyList) {
        this.studyList = studyList;
    }

    
    public Study addStudy(){
        Study s=new Study();
        studyList.add(s);
        return s;
    }
    public void deleteStudy(Study s){
        studyList.remove(s);
    }
}
