package com.marolix.objectclass;

public class EqualsMetod 
{
public static void main(String[] args) {
	int n=10;
	int m=10;
	System.out.println(n==m);
	
	String s="deva";
	String s1="deva";
	System.out.println(s==s1);
	
	EqualsMetod e=new EqualsMetod();
	EqualsMetod e1=new EqualsMetod();
	System.out.println(e==e1);
	System.out.println(e.equals(e1));
	
}
public native String getString(); 


}
