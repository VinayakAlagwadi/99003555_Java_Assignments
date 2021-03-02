package com.AV.comparator;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {


	@Override
	public int compare(Player o1, Player o2) {
		if(o1.getSkill().compareTo(o1.getSkill())==0){
			
			return o1.getName().compareTo(o1.getName());
			
		}
		else 
			return o1.getSkill().compareTo(o1.getSkill());
		
		// TODO Auto-generated method stub
	//	if(o1.getSkill().compareTo(o2.getSkill())>0) && (o1.getSkill().compareTo(o2.getSkill())>0)  ;
		//int k=o1.getSkill().compareTo(o2.getSkill());
		//int j=o1.getName()
	}

}
