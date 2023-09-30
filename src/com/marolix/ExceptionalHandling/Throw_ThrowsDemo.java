package com.marolix.ExceptionalHandling;
class DivisonDemo extends RuntimeException{
	public DivisonDemo(String s) {
		super(s);
	}
}
public class Throw_ThrowsDemo 
{
public static void main(String[] args) throws Exception{
	int a=10;
	int b=0;
	if(b==0) 
	try {
		throw new DivisonDemo("Denominator should not be zero");
		}
	catch (Exception e) {
		
	}
	
}
}
