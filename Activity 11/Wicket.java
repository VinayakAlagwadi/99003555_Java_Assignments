package com.AV.Map;

public class Wicket {

	
	private String playerName;
	private Bowler bowlerObject;
	
	
	
	public Wicket(String playerName, Bowler bowlerObject) {
		super();
		this.playerName = playerName;
		this.bowlerObject = bowlerObject;
	}
	
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Bowler getBowlerObject() {
		return bowlerObject;
	}
	public void setBowlerObject(Bowler bowlerObject) {
		this.bowlerObject = bowlerObject;
	}


	@Override
	public String toString() {
		return "Wicket [playerName=" + playerName + ", bowlerObject=" + bowlerObject + "]";
	}
	
	
	
	
}
