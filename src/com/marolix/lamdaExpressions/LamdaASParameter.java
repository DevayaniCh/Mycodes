package com.marolix.lamdaExpressions;
@FunctionalInterface
interface stringReverse{
	String reverse(String s);
}
public class LamdaASParameter 
{
	void dispay(stringReverse s) {
		System.out.println(s);
	}
public static void main(String[] args) {
	LamdaASParameter lap=new LamdaASParameter();
	stringReverse s=(String s1)->{
		return new StringBuffer().reverse().toString();
	};
	lap.dispay((String s1)->{
		return new StringBuffer().reverse().toString();
	});
}
}
