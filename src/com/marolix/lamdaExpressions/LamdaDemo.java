package com.marolix.lamdaExpressions;
@FunctionalInterface
interface lamda{
	void m1();
	default void m2() {
		
		System.out.println("This is default method");
	}
}
public class LamdaDemo 
{
	public static void main(String[] args) 
	{
	lamda l1=()->{
		System.out.println("This is a lamda example");
	};
     l1.m1();
     l1.m2();
}
}
