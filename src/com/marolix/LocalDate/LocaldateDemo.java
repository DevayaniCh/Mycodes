package com.marolix.LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocaldateDemo 
{
public static void main(String[] args) {
	LocalDate todate=LocalDate.now();
	LocalTime totime=LocalTime.now();
	
	System.out.println(todate+" "+totime);
	
	LocalDateTime date_time=LocalDateTime.now();
	System.out.println(date_time);
	
	//particularDate
	LocalDate spdate=LocalDate.of(2001, 4, 22);
	System.out.println(spdate);
	System.out.println(todate.minusYears(18));//2005-07-24
	System.out.println(todate.plusDays(10));//23-08-03
	if(todate.minusYears(18).isAfter(spdate)) {
		System.out.println("Eligible");
	}
	else {
		System.out.println("Not eligible");
	}
}
}
