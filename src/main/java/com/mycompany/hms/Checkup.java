package com.mycompany.hms;

public class Checkup {
    Doctor Doctor;
    Patient Patient;
    int Prioricy;
    String Recomendation, Date;

    public Checkup(Doctor Doctor, Patient Patient, int Prioricy, String Recomendation, String Date) {
        this.Doctor = Doctor;
        this.Patient = Patient;
        this.Prioricy = Prioricy;
        this.Recomendation = Recomendation;
        this.Date = Date;
    }

    public Doctor getDoctor() {
        return Doctor;
    }

    public void setDoctor(Doctor Doctor) {
        this.Doctor = Doctor;
    }

    public Patient getPatient() {
        return Patient;
    }

    public void setPatient(Patient Patient) {
        this.Patient = Patient;
    }

    public int getPrioricy() {
        return Prioricy;
    }

    public void setPrioricy(int Prioricy) {
        this.Prioricy = Prioricy;
    }

    public String getRecomendation() {
        return Recomendation;
    }

    public void setRecomendation(String Recomendation) {
        this.Recomendation = Recomendation;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "Checkup{" + "Doctor=" + Doctor.toString() + ", Patient=" + Patient.toString() + ", Prioricy=" + Prioricy + ", Recomendation=" + Recomendation + ", Date=" + Date + '}';
    }
    
    
}
