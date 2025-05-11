/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hms;

/**
 *
 * @author Admin
 */
public class HMS {

    public static void main(String[] args) {
        Patient p1 = new Patient("11","TRUNGKI","14121451");
        Patient p2 = new Patient("22","BACKI","1412511");
        Patient p3 = new Patient("33","NAMKI","14122451");
        
        PatientList plist = new PatientList();
        plist.Insert(p1);
        plist.Insert(p2);
        plist.Insert(p3);
        
        Doctor d1 = new Doctor("11","TRUNGKI","14121451","",100);
        Doctor d2 = new Doctor("22","TRUNGKI","14121451","",200);
        Doctor d3 = new Doctor("33","TRUNGKI","14121451","",300);
        
        
        System.out.println(plist.searchByID("11").getName());
        
        System.out.println(plist.searchByContact("1412511").getName());
    }
}
