package com.AV.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class TeamComparatorMain {
	
	
	public static void main(String[] args) {
	
	// TODO Auto-generated method stub

		System.out.println("Enter the no of teams");

		Scanner sc = new Scanner(System.in);
		

		int n= sc.nextInt();
	
	ArrayList <Team> ar = new ArrayList<Team>();
	
	String s=null;
	long nom= 0;
	
	for(int i=0;i<n;i++){
		
		System.out.println("Enter"+ (i+1)+ "detail");
		s=sc.next();
		System.out.println("Enter the no of matches");
		nom=sc.nextLong();
		
		ar.add(new Team(s,nom));
	}
	
	Collections.sort(ar,new TeamComparator());
	
	for(Team e:ar)
	{
		System.out.println(e);
	}
	
	
	//ar.add(new Team(sc, nom));
		
		
		
		
		
		
	}
	
	
		

}
