/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Attribute;

import java.util.ArrayList;

/**
 *
 * @author dheer
 */
public class InformationArray {
    private ArrayList<Information> prevInfo;

    public InformationArray() {
        this.prevInfo = new ArrayList<Information>();
    }
    
    

    public ArrayList<Information> getPrevInfo() {
        return prevInfo;
    }

    public void setPrevInfo(ArrayList<Information> prevInfo) {
        this.prevInfo = prevInfo;
    }
    
      public Information addEmployee(){
        Information info =new Information();
        prevInfo.add(info);
        return info;
    }
      public void delete(Information info){
        prevInfo.remove(info);
        
    }
    
    
}
