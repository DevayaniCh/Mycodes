package com.marolix.Collections;

import java.util.ArrayList;
import java.util.Collection;
public class Methods 
{
public static void main(String[] args) {
	Collection<Integer> c=new ArrayList<Integer>();
	Collection<Integer> c1=new ArrayList<Integer>();
	c.add(10);
	c.add(20);
	c.add(30);
	System.out.println(c);
	System.out.println(c.remove(10));
	
	System.out.println(c.size());
	
	c1.addAll(c);
	System.out.println(c1);
//	if(c.isEmpty()) {
//		System.out.println("No elements found");
//	}
//	else {
//		System.out.println("elements found "+c.size());
//	}
	
}
}
