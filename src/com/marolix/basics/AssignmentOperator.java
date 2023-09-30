package com.marolix.basics;

public class AssignmentOperator 
{
public static void main(String[] args) {
	int a[]=new int[3];
	System.out.println("Default value of a primitive vdata type "+a[0]);
	
	Integer b[]=new Integer[3];
	System.out.println("Default value of Non Primitive data type "+b[0]);
	
	int c,d,e,f;
	c=d=e=f=20;
	System.out.println(c+" "+d+" "+e+" "+f);
}
}
