package com.marolix.basics;

public class for_each 
{
public static void main(String[] args) {
	for_each f1=new for_each();
	f1.sum(1,2,3,4,5,6);
	f1.sum(1.20,1.50,1.6);
	f1.sum("dev","deva","devayani ");
	}
public int sum(int...x)
{
	int sum=0;
	for (int i : x) {
		sum=sum+i;
	}
	System.out.println(sum);
	return sum;
}
public void sum(double...x)
{
	double sum=0;
	for (double d : x) {
		sum=sum+d;
	}
	System.out.println(sum);
}
public void sum(String...x)
{
	String sum="0";
	for (String strin : x) {
		sum=sum+strin;
	}
	System.out.println(sum);
}
}
