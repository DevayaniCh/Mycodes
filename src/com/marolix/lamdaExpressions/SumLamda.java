package com.marolix.lamdaExpressions;
@FunctionalInterface
public interface SumLamda {
 Integer sum(int a,int b);
}
class Dummy1 implements SumLamda{
	
	@Override
	public Integer sum(int a, int b) {
		return a+b;
		
	}
	public static void main(String[] args) {
		SumLamda Sl=( a, b)-> 
			 a+b;
		
		int c=Sl.sum(10,12);
		System.out.println(c);
	}
	
}
