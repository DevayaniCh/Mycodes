package com.marolix.StringBuilder;

public class AllMethods 
{
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder();
	System.out.println(sb.capacity());
	// System.out.println(sb.charAt(0));
	
	StringBuilder sb1=new StringBuilder("devayani");
	sb1.ensureCapacity(10);
	System.out.println(sb1);
	
}
}
