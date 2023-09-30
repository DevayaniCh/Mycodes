package com.marolix.lamdaExpressions;

interface A<T>{
	T m1(T s);
}

public class LamdaWRTGenerics {
	
public static void main(String[] args)
    {
	A<String> a= (s) -> {
	return s;
			};
			
	String s=a.m1("abc");
	System.out.println(s);
	
	A<Integer> b=(s1)->{
		return s1;
	};
	
	int aa=b.m1(1);
	System.out.println(aa);
	
	A<Character> c=(s2) ->{
		return s2;
	};
	
	char cc=c.m1('a');
	System.out.println(cc);
}
}
