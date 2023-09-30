package com.marolix.Strings;

public class StringClass 
{
public static void main(String[] args) {
	String s="dev";
	String s1="deva";
	System.out.println(s+s1);
	StringBuffer s2=new StringBuffer("devayani").reverse();
	System.out.println(s2);
	StringBuilder s3=new StringBuilder("java").append(1);
	System.out.println(s3);
	StringBuilder s4=new StringBuilder("java").append('a');
	System.out.println(s4);
	StringBuilder s5=new StringBuilder("java").deleteCharAt('j');
	System.out.println(s5);
	
}
}
