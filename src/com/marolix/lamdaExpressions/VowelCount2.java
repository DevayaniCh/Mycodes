package com.marolix.lamdaExpressions;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@FunctionalInterface
public interface VowelCount2 
{
	void countNumberOfCharSequence() ;
}
class Test  {
	//@Override
	//public void countNumberOfCharSequence() {
//		
//}
	public static void main(String[] args) 
	{
//		Test t = new Test();
//		t.countNumberOfCharSequence();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		String input=sc.next();
		VowelCount2 l=()->
		{ 
			HashMap<Character,Integer>map=new HashMap<>();
			char []chars=input.toCharArray();
			for(char ch:chars) {
				if(!map.containsKey(ch)) {
					map.put(ch, 1);	
				}		
		    else {
			int count=map.get(ch);
			map.put(ch, count+1);
         }	
          }
		System.out.println(map);
		};
		l.countNumberOfCharSequence(); 
}
}




