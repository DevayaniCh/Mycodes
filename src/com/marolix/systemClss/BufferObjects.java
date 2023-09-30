package com.marolix.systemClss;

public class BufferObjects 
{
public static void main(String[] args) {
	Integer i=127;
	Integer ii=127;
	System.out.println(i==ii);//range in byte stored in same object
	System.out.println(i.getClass());
	
	Integer i2=128;
	Integer ii2=128;
	System.out.println(i2==ii2);//range crossed byte, so values are storing in different objects
	
	System.out.println(i2.equals(ii2));
	
	String s=new String("abcd");
	String s1="abcd";
	System.out.println(s==s1);
	System.out.println(s.equals(s1));
	
	Long l=1000l;
	Long ll=1000l;
	System.out.println(l==ll);
	System.out.println(l.getClass());
	
	
	
}
}
