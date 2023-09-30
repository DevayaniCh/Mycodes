package com.marolix.basics;

public class ArthimaticOperators 
{
public static void main(String[] args) {
	int a=10;
	int b=10;
	double c=b/a;
	System.out.println(c); 
	char ch='a';
	char ch1='b';
	int ch2=ch+ch1;
	System.out.println("output of int is :"+ch2);
	char ch3='f';
	char ch4='b';
	char ch5=(char)(ch3+ch4);
	System.out.println("output of char is "+ch5);
	 char ch6='a';
	 char ch7='b';
	 //String ch8=ch6+ch7;{error cannot convert into String
	 
	 String s="dev";
	 String s1="deva";
	 String s2=s+s1;
	 System.out.println(s2);
	 
	 
	 double v=0.0;
	 double v1=0.0;
	 double d=v1/v;
	 //System.out.println(10/0);ArthimaticException
	 //System.out.println(d);ArthimaticException
	 System.out.println(d);
	 
	 int a1=0;
	 int a2=10;
	 double a3=a2/a1;
	 System.out.println(a3);
}
}
