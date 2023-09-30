package com.marolix.oopsConcepts;

public class EqualsAssi1 
{
	String sName;
	long mobileNumber;
public EqualsAssi1(String sName, long mobileNumber) {
		super();
		this.sName = sName;
		this.mobileNumber = mobileNumber;
	}

public static void main(String[] args) {
	EqualsAssi1 e1=new EqualsAssi1("devayani", 9876543210l);
	EqualsAssi1 e2=new EqualsAssi1("devayani2", 9876543201l);
	
	System.out.println(e1.equals(e2));
}
}
