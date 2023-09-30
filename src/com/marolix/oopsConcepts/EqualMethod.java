package com.marolix.oopsConcepts;

public class EqualMethod 
{
	public String toString() {
		return "this ";
	}
public static void main(String[] args) {
	EqualMethod e1=new EqualMethod();
	EqualMethod e2=new EqualMethod();
	System.out.println(e1);
	System.out.println(e2);
	//System.out.println(e1==e2);
	String s=e1.toString();
	System.out.println(s);
	e1.toString();
	System.out.println(e1);
	//System.out.println(e1 instanceof EqualMethod);
}
}
