package com.marolix.Strings;

public class DuplicatesString 
{
public static void main(String[] args) {
	String inputString="student";
    String outputString=DuplicatesString(inputString);
	System.out.println(outputString);
}
public static String remove(String input) {
	StringBuilder result=new StringBuilder();
	for(int i=0;i<input.length();i++) {
		char currentchar=input.charAt(i);
		if(i==0||currentchar!= input.charAt(i-1)) {
			result.append(currentchar);
		}
	}
	return result.toString();
}
}
