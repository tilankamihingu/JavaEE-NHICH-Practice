/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import model.Patient;


/**
 *
 * @author Click
 */
@Named(value = "patientController")
@SessionScoped
public class PatientController implements Serializable {
    
   private List<Patient> patients;
   
   private Patient currentPatient;
    /**
     * Creates a new instance of PatientController
     */
    public PatientController() {
    }
    
    public String savePatient(){
        if(currentPatient.getId()==null){
            Integer tempid= getPatients().size()+1;
            currentPatient.setId(tempid.longValue());
            getPatients().add(currentPatient);
        }else{
            
        }
        
        return toViewPatients();
    }
    
    public String toHomePage(){
        return "index";
    }
    
    public String toEditPatient(){
        return "patient";
    }
    
    public String toAddNewPatient(){
        currentPatient = new Patient();
        return "patient";
    }
    
    public String toViewPatients(){
        return "patients";
    }

    public List<Patient> getPatients() {
        if(patients==null){
            patients = new ArrayList<>();
        }
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public Patient getCurrentPatient() {
        return currentPatient;
    }

    public void setCurrentPatient(Patient currentPatient) {
        this.currentPatient = currentPatient;
    }
    
    
}
