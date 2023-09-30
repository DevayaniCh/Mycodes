package com.marolix.StringBuffer;

public class InsertMethod 
{
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("i am string buffer with string instance");
	sb.insert(8, 'F');
	System.out.println(sb);
}
}
