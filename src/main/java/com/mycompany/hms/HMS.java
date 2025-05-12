/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hms;

import java.util.*;
import com.mycompany.hms.CheckUpList;
import com.mycompany.hms.PatientList;
import com.mycompany.hms.DoctorsList;
/**
 *
 * @author Admin
 */
public class HMS {

    public static void main(String[] args) {
   
        PatientList plist = new PatientList();
        DoctorsList dlist = new DoctorsList();
        Scanner s = new Scanner(System.in);
        
            String choice;
            
            while(true){
                MainMenu();
                choice = s.nextLine();
                if(choice.equals("1")){
                    System.out.println("\n Doctor ID");
                    String id = s.nextLine();
                    
                    System.out.println("\n Doctor Name");
                    String name = s.nextLine();
                    
                    System.out.println("\n Doctor Contact");
                    String contact = s.nextLine();
                    
                    System.out.println("\n Doctor Speciality    ");
                    String spec = s.nextLine();
                    
                    System.out.println("\n Doctor Fee");
                    int fee = s.nextInt();
                    s.nextLine();
                    
                    Doctor d=new Doctor(id, name, contact, spec, fee);
                    dlist.Insert(d);
                    
                    
                }
                else if(choice.equals("2")){
                    System.out.println("\n Patient ID");
                    String id = s.nextLine();
                    
                    System.out.println("\n Patient Name");
                    String name = s.nextLine();
                    
                    System.out.println("\n Patient Contact  ");
                    String contact = s.nextLine();
                    
                    Patient patient = new Patient(id, name, contact);
                    plist.Insert(patient);
                }
                else if(choice.equals("3")){
                    dlist.PrintData();
                }
                else if(choice.equals("4")){
                    plist.PrintData();
                }
                else if(choice.equals("5")){
                    System.out.println("\nWelcome to CheckUp Menu \n");
                    
                    CheckUpList[] clist = new CheckUpList[dlist.size()];
                    //System.out.println(clist.length);
                    for (int i=0;i<clist.length; i++){
                        clist[i] = new CheckUpList();
                        Doctor doctor = dlist.getAtIndex(i);
                        System.out.println("\nEnter Patient For Doctor");
                        System.out.println("Name        :"+doctor.getName());
                        System.out.println("Speciality  :"+doctor.getSpeciality());
                        System.out.println("Fees        :"+doctor.getFees());
                        
                        System.out.println("All Patient :");
                        plist.PrintData();
                        while(true){
                            System.out.println("Enter Patient id Or type null to Stop");
                            String id=s.nextLine();
                            
                            if (id.equals("null")){
                                break;
                            }
                            
                            System.out.println("Priority 3 for Emergency 2 for Intermediate any other key for normal ");
                            String per=s.nextLine();
                            
                            int p=1;
                            
                            if  (per.equals("3")){
                                p=3;
                            }
                            else if (per.equals("2")){
                                p=2;
                            }
                            
                            Patient patient=plist.searchByID(id);
                            if(patient==null){
                                System.out.println("\nInvalid Patirnt ID : \n");
                                    
                            }
                            else{
                                Checkup cup = new Checkup(doctor, patient, p,"",""+java.util.Calendar.getInstance().getTime().toString());
                                
                                clist[i].Enqueue(cup);
                            }
                        }
                        
                    }
                    for (int i=0;i<clist.length;i++){
                        System.out.println("\n\n Patient "+(i+1)+" In Queue for Doctor "+dlist.getAtIndex(i).getName());
                        
                        for (int j=0;j<clist[i].size();j++){
                            System.out.println("Enter Recomendation For Patient : "+clist[i].getPatient(j));
                            String rec=s.nextLine();
                            clist[i].addRecomendation(j, rec);
                        }
                    }
                }
                else if (choice.equals("0")){
                    break;
                }
                else{
                    System.out.println("\n\nInvalid Choice ! \n");
                    
                }
                
            }
    }
     public static void MainMenu(){
         System.out.println("\n\n ||    *****   HMS     *****   ||");
         System.out.println("           ||  Main Menu   ||");
         System.out.println("\nEnter 1 for Insert New Doctor    ");
         System.out.println("Enter 2 for Insert Patient ");
         System.out.println("\nEnter 3 for Print all Doctor ");
         System.out.println("Enter 4 for Print all Patient ");
         
         
         System.out.println("Enter 5 for CheckUp Menu ");
         System.out.println("Enter 0 for Exit ");
       
                

    }
}
