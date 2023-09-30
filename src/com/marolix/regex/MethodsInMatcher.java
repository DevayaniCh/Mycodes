package com.marolix.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodsInMatcher 
{
public static void main(String[] args) {
//	Pattern p=Pattern.compile("a.");
//	String s="I am devayani.i am java learner";
//	Matcher m=p.matcher(s);
//	int i=0;
//	while(m.find()) {
//		i++;
//		//System.out.println(m.start());
//		//System.out.println(m.end());
//		System.out.println(i+""+m.group());
//	}
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your email");
	String email=sc.next();
	Pattern p5=Pattern.compile("[a-z]+[0-9]+[@][a-z]+[.][a-z]+");
	Matcher m5=p5.matcher(email);
	if(m5.find()) {
		System.out.println("Your email is "+m5.group());
	}
	else {
		System.out.println("no");
	}
}
}
