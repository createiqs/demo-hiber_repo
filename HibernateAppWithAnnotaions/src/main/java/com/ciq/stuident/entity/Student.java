package com.ciq.stuident.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 55, nullable = false, name = " s_name")
	private String name;
	@Column
	private double fee;
	@Column(length = 250, nullable = false, unique = true)
	private String email;

	public Student() {

	}

	public Student(int id, String name, double fee, String email) {

		this.id = id;
		this.name = name;
		this.fee = fee;
		this.email = email;
	}

	public Student(String name, double fee, String email) {
		super();
		this.name = name;
		this.fee = fee;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + ", email=" + email + "]";
	}

}
