package com.AV.package1;
import java.util.*;
import java.lang.*;

public class DemoString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println( "Enter player 1 Name");
		
		String s1 = sc.next();
		
		System.out.println( "Enter Player 2 Name");
		
		String s2 = sc.next();
		
		String[] t1 = s1.split(" ");
		
		String[] t2 = s2.split(" ");
		
		if(t1[1]==t2[1]){
			System.out.println("yes");
			
		}
		else
		{
			System.out.println("no");
		}
		
		
		
		
	}

}
