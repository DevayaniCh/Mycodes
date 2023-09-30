package com.marolix.StringBuffer;

public class CharAtMethod 
{
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("i am stringBuffer object with instance");
	char ch=sb.charAt(10);
	System.out.println(ch);
	
	char[] ch1=new char[50];
	sb.getChars(0, 10, ch1, 5);
	System.out.println(ch1);
	
	sb.setCharAt(0, '#');
	System.out.println(sb);
	
	
	}
}
