package com.marolix.basics;
import java.util.Scanner;
public class ReverseNumber 
{
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter the number ");
	int n=123;
	int temp=0;
	int rev=0;
	for(;n!=0;) {
		temp=n%10;//take the digit
		rev=(rev*10)+temp;//store the digit
		n=n/10;//remove the digit
	}
	System.out.println(rev);
	StringBuffer sB=new StringBuffer("1234").reverse();
	System.out.println(sB);
	StringBuilder sb=new StringBuilder("123456").reverse();
	System.out.println(sb);
//	int num=13456;
//	System.out.println(num.reverse());
}
}
