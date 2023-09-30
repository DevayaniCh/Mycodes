package com.marolix.basics;

import java.util.Iterator;

public class ForLoop 
{
public static void main(String[] args) {
	for(int i=0;i<=10;i++) {
		if(i==5 || i==10) {
		continue;
		}
		System.out.println(i);
	
	}
}
}
