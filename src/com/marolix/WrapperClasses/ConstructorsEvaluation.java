package com.marolix.WrapperClasses;

import java.lang.reflect.Constructor;

public class ConstructorsEvaluation 
{
public static void main(String[] args) throws ClassNotFoundException {
	int i=0;
	Class c=Class.forName("java.lang.String");
	Constructor[] c1=c.getConstructors();
	for(Constructor c2:c1) {
		System.out.println(++i+":"+c2);
	}
}
}
