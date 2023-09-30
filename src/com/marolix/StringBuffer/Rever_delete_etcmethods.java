package com.marolix.StringBuffer;

public class Rever_delete_etcmethods 
{
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("I am stringbuffer with string instance");
	//sb.reverse();
	System.out.println(sb);
	
//    sb.delete(3, 14);
//	System.out.println(sb);
	
	sb.deleteCharAt(0);
	System.out.println(sb);
}
}
