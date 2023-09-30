package com.marolix.oopsConcepts;
public class MethodOverloading 
{
	public static void main(String[] args) 
	{
		//MethodOverloading m1=new MethodOverloading();
		sum(1,2,3,4,5,6);
		sum(15.4,4.3,1.3);
		sum(20l,1l);
		sum(14.4f,2.3f,4.3f);
		sum("dev","deva","devayani");
		
	}
	public static void sum(int...x)
	{
		int sum=0;
		for (int i : x) {
			sum=sum+i;
		}
		System.out.println("with int "+sum);
		
	}
	public static void sum(double...x)
	{
		double sum=0;
		for (double d : x) {
			sum=sum+d;
		}
		System.out.println("with double "+sum);
	}
	public static void sum(long...x)
	{
		long sum=0;
		for (long b : x) {
			sum=sum+b;
		}
		System.out.println("with long "+sum);
	}
	public static void sum(float...x)
	{
		float sum=0;
		for (float b : x) {
			sum=sum+b;
		}
		System.out.println("with float "+sum);
	}

	public static void sum(String...x) 
	{
	for(String s1 : x) 
	{
		System.out.println(s1);
	}
	}
}

