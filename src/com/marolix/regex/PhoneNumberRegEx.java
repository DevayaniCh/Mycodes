package com.marolix.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberRegEx 
{
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter phone number");
	String phoneNumber=sc.nextLine();
	Pattern p = Pattern.compile("[+][9][1][ ][4-9][0-9]{9}");
	Matcher m=p.matcher(phoneNumber);
	if(m.find()) {//if(phoneNumber.matches("[0-9]{10}");
		System.out.println("valid phonenumber and the number is "+m.group());
	}
	
	else {
		System.out.println("not a valid");
	}
}
}

