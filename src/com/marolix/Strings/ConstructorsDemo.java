package com.marolix.Strings;

import java.lang.reflect.Constructor;

public class ConstructorsDemo {

	public static void main(String[] args) throws ClassNotFoundException{
		int i=0;
		Class c=Class.forName("java.lang.String");
		Constructor[] c1=c.getConstructors();
		for(Constructor constructor:c1) {
			System.out.println(++i +" : "+constructor);
		}

	}

}
