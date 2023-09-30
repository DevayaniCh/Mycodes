package com.marolix.Strings;

import java.util.Scanner;

public class FirstandLastLettersAss 
{
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter the mailId");
	String mailId=scanner.nextLine();
	System.out.println("enter the mobileNumber");
	String mobileNumber=scanner.nextLine();
	int index=mailId.indexOf('@');
	if(index != 0 && index >=4) {
		String name=mailId.substring(0, index);
		if(name.length()>=6 && mobileNumber.length()>=4)
		{
			String firstLetters=name.substring(0,3);
			String lastLetters=name.substring(name.length()-3);
			String firstnumbers=mobileNumber.substring(0,4);
			String result=firstLetters+lastLetters+firstnumbers;
			System.out.println("output string is "+result);
	}
		
}
}
}
