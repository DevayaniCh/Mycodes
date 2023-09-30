package com.marolix.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationForm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name");
		String Fn=sc.nextLine();
		System.out.println("Enter your Last Name");
        String Ln=sc.nextLine();
        Pattern p=Pattern.compile("[A-Z][a-z]+( [A-Z][a-z]+)+");
        String s=Fn+" "+Ln;
    	Matcher m=p.matcher(s);
    	if(m.matches()) {
    		System.out.println("Your full Name is "+m.group());
    	}
    	else {
    		System.out.println("no");
    	}
    	System.out.println("enter phone number");
    	String phoneNumber=sc.next();
    	Pattern p1 = Pattern.compile("[4-9][0-9]{9}");
    	Matcher m1=p1.matcher(phoneNumber);
    	if(m1.find()) {
    		System.out.println("Your phonenumber  is "+m1.group());
    	}
    	else {
    		System.out.println("no");
    	}
    	System.out.println("Enter your adhar card number");
    	String AdharNumber=sc.nextLine();
    	Pattern p2=Pattern.compile("[0-9]{4}([\\s][0-9]{4}){2}");
    	Matcher m2=p2.matcher(AdharNumber);
    	if(m2.matches()) {
    		System.out.println("Your Adhar Number is "+m2.group());
    	}
    	else {
    		System.out.println("no");
    	}
    	System.out.println("Enter your Pan card number");
    	String PanNumber=sc.next();
    	Pattern p3=Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]");
    	Matcher m3=p3.matcher(PanNumber);
    	if(m3.matches()) {
    		System.out.println("Your Pan Number is "+m3.group());
    	}
    	else {
    		System.out.println("no");
    	}
    	System.out.println("Enter the password");
    	String PassWord=sc.next();
    	Pattern p4=Pattern.compile("[A-z][a-z]+[0-9]+[#]+");
    	Matcher m4=p4.matcher(PassWord);
    	if(m4.find()) {
    		System.out.println("Your Pssword is "+m4.group());

    	}
    	else {
    		System.out.println("no");
    	}
    	System.out.println("Enter your email");
    	String email=sc.next();
    	Pattern p5=Pattern.compile("[a-z0-9]+[@][a-z]+[.][a-z]+");
    	Matcher m5=p5.matcher(email);
    	if(m5.find()) {
    		System.out.println("Your email is "+m5.group());
    	}
    	else {
    		System.out.println("no");
    	}
    	System.out.println("Your full Name is "+s);
    	System.out.println("Your phonenumber  is "+m1.group());
    	System.out.println("Your Adhar Number is "+m2.group());
    	System.out.println("Your Pan Number is "+m3.group());
    	System.out.println("Your Pssword is "+m4.group());
    	System.out.println("Your email is "+m5.group());
	}

}
