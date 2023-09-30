package com.marolix.basics;

import java.util.Scanner;

public class Enum2 
{
	enum sizeOfPizza
	{
		small,medium,large
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of pizza");
	String s1=sc.nextLine().toUpperCase().toLowerCase();
	sizeOfPizza s=sizeOfPizza.valueOf(s1);
	float cst=0f;	
	switch(s) {
	case small:
	cst=50;
	System.out.println("cost of small pizza is rs"+cst);
	break;
	case medium:
	cst=100;
	System.out.println("cost of medium pizza is rs"+cst);
	break;
	case large:
	cst=150;
	System.out.println("cost of large pizza is rs"+cst);
	break;
	default:
	System.out.println("please provide valid size");
	
	}
	}
}

