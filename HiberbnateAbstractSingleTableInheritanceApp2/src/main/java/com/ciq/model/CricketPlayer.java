package com.ciq.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@DiscriminatorValue(value = "fb_type")
public class CricketPlayer extends Player {

	@Column
	private String teamName;
	@Column
	private String playerType;

	public CricketPlayer() {

	}

	public CricketPlayer(String name, String bodyType, String teamName, String playerType) {
		super(name, bodyType);
		this.teamName = teamName;
		this.playerType = playerType;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getPlayerType() {
		return playerType;
	}

	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}

	@Override
	public String toString() {
		return "CricketPlayer [teamName=" + teamName + ", playerType=" + playerType + "]" + super.toString();
	}

}
