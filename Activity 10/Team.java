package com.AV.comparator;

public class Team {
	private String name;
	private Long noOfMatches;
	
	
	
	public Team(String name, Long noOfMatches) {
		super();
		this.name = name;
		this.noOfMatches = noOfMatches;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Team [name=" + name + ", noOfMatches=" + noOfMatches + "]";
	}
	public Long getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(Long noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	

}
