package com.marolix.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanNumberRegex 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Pan card number");
	String PanNumber=sc.next();
	Pattern p=Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]");
	Matcher m=p.matcher(PanNumber);
	if(m.find()) {
		
		System.out.println("Your PAN number is "+m.group());
	}
	else {
		System.out.println("Not a valid format");
	}
}
}
