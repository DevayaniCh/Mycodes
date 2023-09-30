package com.marolix.WrapperClasses;

public class Demo 
{
public static void main(String[] args) {
	Integer i=new Integer(10);
	Integer ii=new Integer("10");
    //Integer i3=new Integer("ten");//Numberformat exception
	System.out.println(i);
	System.out.println(ii);
	
	Boolean b=new Boolean(true);
	Boolean b1=new Boolean("TRUe");
	Boolean b2=new Boolean("true");
	System.out.println(b+" "+b1+" "+b2);
}
}
