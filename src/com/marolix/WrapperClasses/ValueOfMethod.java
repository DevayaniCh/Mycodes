package com.marolix.WrapperClasses;

public class ValueOfMethod {
public static void main(String[] args) {
	Integer i=Integer.valueOf(10);
	Integer ii=Integer.valueOf("10");
	System.out.println(i+" "+ii);

	Character c=Character.valueOf('c');
	Character cc=Character.valueOf(c);
	
	System.out.println(c.charValue()+" "+cc);
	
	Short s=Short.valueOf("10");
	
	Boolean b=Boolean.valueOf(true);
	Boolean bb=Boolean.valueOf("true");
	
	
}
}
