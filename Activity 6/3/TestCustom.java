package com.AV.ExceptionHandling;

import java.util.Scanner;

public class TestCustom {
	static String playerName;
	static int playerAge;
	
	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Plyer details\nEnter Player Name");
		playerName=sc.next();
		
		System.out.println("Enter Player Age");
		playerAge=sc.nextInt();
		
		if(playerAge<19){
			throw new CustomException();
			
		}
		else{
			System.out.println("Player registered");
			System.out.println("Player Name "+playerName);
			System.out.println("Player Age "+playerAge);
			
		}
		
		
		
	}

}
