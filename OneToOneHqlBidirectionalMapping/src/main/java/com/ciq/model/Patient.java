package com.ciq.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String patientName;
	@Column
	private int mobileNumber;
	@Column
	private String healthIssue;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "patient")
	private Doctor doctor;

	public Patient() {

	}

	public Patient(String patientName, int mobileNumber, String healthIssue) {
		this.patientName = patientName;
		this.mobileNumber = mobileNumber;
		this.healthIssue = healthIssue;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getHealthIssue() {
		return healthIssue;
	}

	public void setHealthIssue(String healthIssue) {
		this.healthIssue = healthIssue;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", patientName=" + patientName + ", mobileNumber=" + mobileNumber
				+ ", healthIssue=" + healthIssue + ", doctor=" + doctor + "]";
	}

}
