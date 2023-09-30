package com.marolix.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FullNameRegex 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your first Name");
	String FN=sc.next();
	System.out.println("Enter your Last Name");
	String Ln=sc.next();
	Pattern p=Pattern.compile("[A-Z][a-z]+");
	Matcher m=p.matcher(FN+""+Ln);
	if(m.find()) {
		System.out.println(FN+" "+Ln);
	}
	else {
		System.out.println("Not a valid");
	}
	
}
}
