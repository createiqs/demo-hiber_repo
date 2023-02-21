package com.ciq.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries({
	
	@NamedQuery(name = "get.Doctors", query = "from Doctor")
	,@NamedQuery(name="get.ByName", query = "from Doctor d where d.docterName='Jain'")
	,@NamedQuery(name = "get.joinData", query = "select d from Doctor d join d.patient pat where pat.mobileNumber = '123456777'")
	
})
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String docterName;

	@Column
	private String specilist;

	@Column
	private double admissionFee;

	@OneToOne(cascade = CascadeType.ALL)
	private Patient patient;

	public Doctor() {
	}

	public Doctor(String docterName, String specilist, double admissionFee, Patient patient) {
		super();
		this.docterName = docterName;
		this.specilist = specilist;
		this.admissionFee = admissionFee;
		this.patient = patient;
	}

	public long getId() {
		return id;
	}


	public String getDocterName() {
		return docterName;
	}

	public void setDocterName(String docterName) {
		this.docterName = docterName;
	}

	public String getSpecilist() {
		return specilist;
	}

	public void setSpecilist(String specilist) {
		this.specilist = specilist;
	}

	public double getAdmissionFee() {
		return admissionFee;
	}

	public void setAdmissionFee(double admissionFee) {
		this.admissionFee = admissionFee;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", docterName=" + docterName + ", specilist=" + specilist + ", admissionFee="
				+ admissionFee + "]";
	}
 
	
}
