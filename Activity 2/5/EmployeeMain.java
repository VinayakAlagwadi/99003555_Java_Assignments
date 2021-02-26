package com.AV.package2;

import java.util.*;
public class EmployeeMain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		String nm = sc.next();
		
		System.out.println("Enter Address:");
		String add = sc.next();
		
		System.out.println("Enter Mobile:");
		String m = sc.next();
		
		Employee e = new Employee();
		e.setName(nm);
		e.setAdd(add);
		e.setMob(m);
		
		e.Display();
		
		e.Update();
	}	 
}
