
package com.mycompany.hms;

class DNode{
    Doctor doctor;
    DNode next,pre;

    public DNode() {
    }

    public DNode(Doctor doctor) {
        this.doctor = doctor;
        next=null;
        pre=null;
    }
    
    
}
public class DoctorsList {
    DNode head, tail;

    public DoctorsList() {
        head=null;
        tail=null;
    }
    
    public void Insert(Doctor doctor){
        DNode node = new DNode(doctor);
        
        if(head==null|| tail==null){
            head=node;
            tail=node;
        }
        
        else{
            head.next=node;
            node.pre=head;
            head=node;
            
        }
    }
    
    public Doctor searchByID(String id){
        DNode temp=head;
        while(temp!=null){
            if(temp.doctor.getId().equals(id)){
                return temp.doctor;
               
            }
            temp=temp.pre;
        }
        return null;
    }
    
    public Doctor searchByContact(String contact){
        DNode temp=head;
        while(temp!=null){
            if(temp.doctor.getContact().equals(contact)){
                return temp.doctor;
               
            }
            temp=temp.pre;
        }
        return null;
    }
    
    public void AllDoctorInfo(){
        DNode temp=head;
        while(temp!=null){
            System.out.println(temp.doctor.getId()+"     Speciality ="+temp.doctor.getSpeciality());             
           
            temp=temp.pre;
        }
    }
}
