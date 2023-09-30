package com.marolix.oopsConcepts;

public class HashCodeMethod 
{
public static void main(String[] args) {
	String s="devayani";
	String s1="devayani";
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
	if(s.equals(s1)) {
		System.out.println("both hashcode metods are same");
	}
	else {
		System.out.println("not same");
	}
}
}
