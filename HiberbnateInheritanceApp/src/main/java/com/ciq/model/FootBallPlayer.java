package com.ciq.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class FootBallPlayer extends Player {

	@Column
	private double noOfGoals;
	@Column
	private String teamName;

	public FootBallPlayer() {
	 
	}

	 

	public FootBallPlayer(String name, String bodyType, double noOfGoals, String teamName) {
		super(name, bodyType);
		this.noOfGoals = noOfGoals;
		this.teamName = teamName;
	}



	public double getNoOfGoals() {
		return noOfGoals;
	}

	public void setNoOfGoals(double noOfGoals) {
		this.noOfGoals = noOfGoals;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "FootBallPlayer [noOfGoals=" + noOfGoals + ", teamName=" + teamName + "]" + super.toString();
	}

}
