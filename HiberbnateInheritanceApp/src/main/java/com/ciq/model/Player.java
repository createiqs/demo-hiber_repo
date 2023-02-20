package com.ciq.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String name;
	@Column
	private String bodyType;
	
	public Player() {
	 
	}

	public Player( String name, String bodyType) {
		this.name = name;
		this.bodyType = bodyType;
	}

	public Long getId() {
		return id;
	}

	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", bodyType=" + bodyType + "]";
	}
	
	
	
	

}
