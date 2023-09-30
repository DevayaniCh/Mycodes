package com.marolix.ExceptionalHandling;

import java.util.Scanner;

public class Demo 
{
	public static int doAddition(int a,int b){
		int sum=0;
		System.out.println("Addition method is called");
		sum=a+b;
		System.out.println("Addition value "+sum);
		return sum;
	}
	public static int doMultiplication(int a,int b) {
		
		System.out.println("Multiplication method called");
		System.out.println("multiplication value "+a*b);
		return a*b;
	}
	public static int doDivision(int a,int b) {
		int c=0;
		System.out.println("a is "+a+"b is "+b);
		System.out.println("Divison method called");
		try {
			System.out.println("division value "+a/b);
			c=a+b;
		} catch (RuntimeException e) {
			System.out.println("Error "+e.getMessage());
		    
		}
		return c;
			}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	int a=doAddition(sc.nextInt(),sc.nextInt());
	System.out.println("Enter a number");
	int b=doMultiplication(a,sc.nextInt());
	System.out.println("Enter a number");
	int c=doDivision(b,sc.nextInt());
	System.out.println("Final method is called "+c);
	sc.close();
}
}
