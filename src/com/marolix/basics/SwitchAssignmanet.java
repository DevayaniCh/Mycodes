package com.marolix.basics;

public class SwitchAssignmanet 
{
	
public static void main(String[] args) {	
	calculatePrice("large");
}
public static float calculatePrice(String size) {
	float cost=0f;
	switch(size
			)
	{
	case "small": 
	cost=50.0f;
	System.out.println("Cost of small pizza is : Rs"+cost);
	break;
	case "Medium":
	cost=100.0f;
	System.out.println("cost of medium pizza is : Rs"+cost);
	break;
	case "large":
	cost=150.0f;
	System.out.println("cost of large pizza is: Rs"+cost);
	break;
	default:
	System.out.println("Sorry none of the size .. please provide valid size..");
	break;
	}
	return cost;
}
}
