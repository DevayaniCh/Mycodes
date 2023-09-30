package com.marolix.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdharNumberRegEx 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your adhar card number");
	String AdharNumber=sc.nextLine();
//	Pattern p=Pattern.compile("[0-9]{4}( [0-9]{4}){2}");
//	Matcher m=p.matcher(AdharNumber);
//	if(m.matches()) {
//		System.out.println("Your Adhar number is"+m.group());
//	}
//	else {
//		System.out.println("Not a valid format");
//	}
	
//}
//}
	System.out.println(AdharNumber.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$"));
}
}
