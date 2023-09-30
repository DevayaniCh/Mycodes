package com.marolix.systemClss;

public class SystemclassMethods 
{
public static void main(String[] args) {
	String str="abcd";
System.out.println("current time "+System.currentTimeMillis());	
System.out.println("current time "+System.clearProperty("a"));
System.out.println(System.in);
System.out.println(System.out);
System.out.println(System.identityHashCode(str));
int str1=str.hashCode();
System.out.println(str1);
System.out.println(System.nanoTime());
System.out.println(System.class);

}
}
