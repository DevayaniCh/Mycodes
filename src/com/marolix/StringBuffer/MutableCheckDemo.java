package com.marolix.StringBuffer;

public class MutableCheckDemo 
{
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();
	System.out.println(sb+":"+sb.hashCode());
	sb.append("appended_with_hascode");
	System.out.println(sb+":"+sb.hashCode());
	System.out.println("----------------------");
	
	String s=new String();
	System.out.println(s+":"+s.hashCode());
	s=s.concat("concat_with_hashcode");
	System.out.println(s+":"+s.hashCode());
}
}
