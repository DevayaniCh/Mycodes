package com.marolix.oopsConcepts;

public class MethodOverloading1 
{
	public void m1(int a) {
				System.out.println(a);
				}
			public int m1(double a) {
				System.out.println(a+a);
				return (int) (a+a);
			}
			public double m1(double a, int b) {
				System.out.println(a + b);
				return (a + b);
			}
			public static void main(String[] args) {
				MethodOverloading1 ml = new MethodOverloading1();
				ml.m1(2);
				ml.m1(10.0);
				ml.m1(10, 2);
				ml.m1('a');// m1(char)//auto promotion
		
			}
}
