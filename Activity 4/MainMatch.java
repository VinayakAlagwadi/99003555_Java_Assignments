package com.AV.AbsAndInterface;

import java.util.Scanner;

public class MainMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the match Format\n");
		System.out.println("1.ODI\n 2.T20\n3.Test");
		int n = sc.nextInt();
		if(n==3){
			System.out.println("Enter Current Score");
		    TestMatch t1 = new TestMatch();
		    t1.setCurrentScore(sc.nextInt());
		    
		    System.out.println("Enter Current over");
		    t1.setCurrentOver(sc.nextInt());
		    float reqRunrate= t1.calculateRunRate();
		    int balls= t1.calculateBalls();
		    
		    
		    System.out.println("Enter Targert score");
		    t1.setTarget(sc.nextInt());
		    
		    t1.calculateBalls();
		    t1.calculateRunRate();
		    
		    t1.display(reqRunrate, balls);
		   // t1.display(reqRunrate, balls);
		    
		    
			
		}
		
		
	}

}
