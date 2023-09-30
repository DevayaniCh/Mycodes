package com.marolix.Strings;

import java.util.Scanner;

public class SplitandCaptilize
{
public static String[] split_cap(String inp) {
	String[] words=inp.split(" ");
	for(int i=0;i<words.length;i++) {
		String word=words[i];
		if(!word.isEmpty()) {//we can use isEmpty();
			String firstLetter=word.substring(0,1).toUpperCase();
			String remaining=word.substring(1);
			words[i]=firstLetter+remaining;
		}
	}
	return words;
}
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the input data");
	String input=scanner.nextLine();
	String[] result=split_cap(input);
	for(String string:result) {
		System.out.println(string);
	}
}
}
