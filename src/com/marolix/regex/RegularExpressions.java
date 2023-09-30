package com.marolix.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions 
{
public static void main(String[] args) {
	Pattern p=Pattern.compile("am");
	String s="i am devayani. i am java learner";
	Matcher m=p.matcher(s);
	int i=0;
	while(m.find()) 
	{
		i++;
	}
	System.out.println(i);
}
}
