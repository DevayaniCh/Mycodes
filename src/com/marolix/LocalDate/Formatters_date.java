package com.marolix.LocalDate;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Formatters_date 
{
public static void main(String[] args) {
	LocalDateTime LDT=LocalDateTime.now();
	//M-7[singleDigit Month]
	//MM=07
	//MMM-jul
	//MMMM-july
	//d-single date[without zero]
	//dd-doubleda[with zero]
	//D- 365/nth day
	//y-complete year
	//yy- two digit year//w-week in year,//W-week in month
	//E-day with three char,EE-day with full char//F-day of week in a month
	String s=LDT.format(DateTimeFormatter.ofPattern("MMMM','D','YYYY','E','F"));
	System.out.println(s);
	
	LocalTime lt=LocalTime.now();
	//h-hourfor1-12,H-1-24hrs,m-minute,a-am/pm,s-sec,S-millisec,k-1-24hrs,K-0-11hrs
	String s1=lt.format(DateTimeFormatter.ofPattern("h','m','a','s','S','K','z"));
	System.out.println(s1);
	String s2=LDT.format(DateTimeFormatter.ISO_DATE_TIME);
	System.out.println(s2);
	
}
}
