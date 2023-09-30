package com.marolix.oopsConcepts;

public class MethodOverloading2 
{
	public void m1(int a) {
		System.out.println("int " + a);
	}

	public void m1(Integer a) {
		System.out.println("wrapper " + a);
	}
    public void m1(MethodOverloading2 a) {
    	System.out.println("classname "+a);
    }
	public static void main(String[] args) {
		MethodOverloading2 m2 = new MethodOverloading2();
		m2.m1(1);
		m2.m1(new Integer(1));
		m2.m1(2);
		m2.m1(new MethodOverloading2());
}
}
