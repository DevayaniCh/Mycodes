package com.marolix.oopsConcepts;

import java.util.Scanner;

public class EqualsAss2 
{
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Registration Form");
	System.out.println("Enter Name");
	String name=scan.nextLine();
	
	System.out.println("Enter id");
	int id=scan.nextInt();
	
	System.out.println("Registration successfull");
	System.out.println("Enter 1 for login and other for exit");
	int n=scan.nextInt();
	if(n==1) {
		System.out.println("Enter Name");
		String name2=scan.next();
		if(name.equals(name2)) {
			System.out.println("Done");
		
	}else {
		System.out.println("Logout");
	}
	
	}
}
}
