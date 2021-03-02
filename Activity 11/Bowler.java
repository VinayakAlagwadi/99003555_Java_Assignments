package com.AV.Map;

public class Bowler {
	private String name;

	
	
	public Bowler(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bowler [name=" + name + "]";
	}
	

}
