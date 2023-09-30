package com.marolix.basics;

public class For_Each2 
{
public static void main(String...z) {
	int sum=0;
	int arr[]= {1,2,3,4,56,7,8,9};
	
	for (int i : arr) {
		sum=sum+i;
	}
	System.out.println(sum);
	boolean x=true;
	System.out.println(!x);
	 
}
}
