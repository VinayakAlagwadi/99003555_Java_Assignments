package com.AV.package1;

import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Innings obj1 = new Innings();
		
		
		System.out.println( "Enter the team Name");
		
		obj1.setTeamname(sc.next());
		
		System.out.println( "Enter session ");
		
		obj1.setInningsname(sc.next());
		
		System.out.println( "Enter runs scored ");
		
		obj1.setRuns(sc.nextInt());
		
		obj1.displayInningsDetails();
		
		
		
		
		
		
		
		
	}

}
