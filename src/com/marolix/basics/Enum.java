package com.marolix.basics;

import java.util.Scanner;

public class Enum 
{
	enum sizeOfPizza
	{
		small,medium,large
	}
public static void main(String[] args) {
	calculatePizzaCost();
}
public static void calculatePizzaCost()
{
	float cost=0f;
	sizeOfPizza s1 =sizeOfPizza.valueOf("small");
switch(s1) 
{
case small:
	cost=50;
	System.out.println("cost of small pizza is rs "+cost);
	break;
case medium:
	cost=100;
	System.out.println("cost of medium pizza is rs "+cost);
	break;
case large:
	cost=150;
	System.out.println("cost of large pizza is rs "+cost);
	break;
default:
	System.out.println("please enter valid input");
}
}
}
