package com.marolix.basics;
class AnotherClass{
	
}
public class RelationalOperator extends AnotherClass
{
public static void main(String[] args) {
	char ch='a';
	char ch1='b';
	System.out.println(ch<ch1);
	
	int i=10;
	int i1=20;
	System.out.println(i>i1);
	
	String s="deva";
	String s1="dev";
	System.out.println(s==s1);
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
	
	RelationalOperator r1=new RelationalOperator();
	RelationalOperator r2=new RelationalOperator();
	System.out.println(r1==r2);
	System.out.println(r1.hashCode());
	System.out.println(r2.hashCode());
	
	System.out.println(r1.toString());
	System.out.println(r1.getClass());
	System.out.println(s.toString());
	AnotherClass a1=new AnotherClass();
	
	
	System.out.println(a1==r1);
	
}
}
