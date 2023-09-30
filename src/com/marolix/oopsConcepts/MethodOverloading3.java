package com.marolix.oopsConcepts;

public class MethodOverloading3 
{
	public void m1(int a) {

		System.out.println("int " + a);
	}

	public void m1(Integer a) {

		System.out.println("wrapper " + a);
	}

	public void m1(Number a) {

		System.out.println("abstract " + a);
	}

	public void m1(Object a) {

		System.out.println("object " + a);
	}

	public static void main(String[] args) {
		MethodOverloading3 m3 = new MethodOverloading3();
     	m3.m1(1);
		m3.m1(new Integer(1));
		m3.m1(new Double(1));
		m3.m1(10.0);
		m3.m1(null);
	}
}
