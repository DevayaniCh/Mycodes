package com.marolix.StringBuffer;

public class Constructors 
{
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();
	System.out.println(sb.capacity());
    System.out.println(sb.length());
    System.out.println("------------------------------");
    
    StringBuffer sb1=new StringBuffer(45);
    System.out.println(sb1.capacity());
    System.out.println(sb1.length());
    System.out.println("------------------------------");
    
    StringBuffer sb2=new StringBuffer("dev");
    System.out.println(sb2.capacity());
    System.out.println(sb2.length());
    System.out.println("------------------------------");
    
    StringBuffer sb3=new StringBuffer("a");
    System.out.println(sb3.capacity());
    System.out.println(sb3.length());
    System.out.println("------------------------------");
    
    
}
}
