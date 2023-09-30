package com.marolix.Strings;

import java.util.Iterator;
import java.util.Scanner;

public class CapitalLetterAss 
{
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the input");
	String input=scanner.nextLine();
	String[] s2=input.split(" ");
	for(String string:s2) {
		System.out.println(string);
	}
	}

}

