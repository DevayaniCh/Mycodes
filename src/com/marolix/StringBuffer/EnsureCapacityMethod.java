package com.marolix.StringBuffer;

public class EnsureCapacityMethod
{
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("i am   %");
	
	System.out.println(sb.capacity());
	sb.ensureCapacity(16);
	System.out.println(sb);
}
}
