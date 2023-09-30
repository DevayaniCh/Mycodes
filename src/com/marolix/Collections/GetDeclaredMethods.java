package com.marolix.Collections;

import java.lang.reflect.Method;

public class GetDeclaredMethods 
{
public static void main(String[] args) throws ClassNotFoundException {
	Class c=Class.forName("java.util.Collection");
	Method m[]=c.getDeclaredMethods();
	int i=0;
	for(Method m1:m) {
		i++;
		System.out.println(i+" "+m1);
	}
	
}
}
