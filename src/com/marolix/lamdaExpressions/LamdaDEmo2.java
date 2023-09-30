package com.marolix.lamdaExpressions;
@FunctionalInterface
public interface LamdaDEmo2 
{
String m1(String s);
}
class Dummy implements LamdaDEmo2{

	@Override
	public String m1(String s) {
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		return sb.toString();
	}
	public static void main(String[] args) {
		LamdaDEmo2 ll = (s)->{
			StringBuffer sb=new StringBuffer(s);
			sb.reverse();
			return sb.toString();
			
		};
		
		 String ll2=ll.m1("dev");
		 System.out.println(ll2);
	}
	
}
