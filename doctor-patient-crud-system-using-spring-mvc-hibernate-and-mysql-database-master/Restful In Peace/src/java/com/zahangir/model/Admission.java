package com.zahangir.model;
// Generated Jul 12, 2017 5:29:19 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Admission generated by hbm2java
 */
@Entity
public class Admission  implements java.io.Serializable {


     private Integer admissionId;
    @OneToOne(orphanRemoval = true)
     private Patient patient;
     @Temporal(TemporalType.DATE)
     private Date admissionDate;
     private Set outdoors = new HashSet(0);
     private Set indoors = new HashSet(0);

    public Admission() {
    }

	
    public Admission(Patient patient, Date admissionDate) {
        this.patient = patient;
        this.admissionDate = admissionDate;
    }
    public Admission(Patient patient, Date admissionDate, Set outdoors, Set indoors) {
       this.patient = patient;
       this.admissionDate = admissionDate;
       this.outdoors = outdoors;
       this.indoors = indoors;
    }
   
    public Integer getAdmissionId() {
        return this.admissionId;
    }
    
    public void setAdmissionId(Integer admissionId) {
        this.admissionId = admissionId;
    }
    public Patient getPatient() {
        return this.patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public Date getAdmissionDate() {
        return this.admissionDate;
    }
    
    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }
    public Set getOutdoors() {
        return this.outdoors;
    }
    
    public void setOutdoors(Set outdoors) {
        this.outdoors = outdoors;
    }
    public Set getIndoors() {
        return this.indoors;
    }
    
    public void setIndoors(Set indoors) {
        this.indoors = indoors;
    }




}


