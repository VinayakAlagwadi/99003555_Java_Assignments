package com.AV.comparator;

import java.util.Comparator;


public class TeamComparator implements Comparator<Team> {

	@Override
	public int compare(Team o1, Team o2) {
		// TODO Auto-generated method stub
		return o1.getNoOfMatches().compareTo(o2.getNoOfMatches());
	
		
	}

}
