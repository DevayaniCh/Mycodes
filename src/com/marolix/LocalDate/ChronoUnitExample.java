package com.marolix.LocalDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitExample 
{
public static void main(String[] args) {
	LocalDate d=LocalDate.now();
	LocalDate d1=d.plusMonths(60);
	long a=ChronoUnit.DAYS.between(d, d1);
	long a1=ChronoUnit.MONTHS.between(d, d1);
	long a2=ChronoUnit.YEARS.between(d, d1);
	System.out.println(a+" "+a1+" "+a2);
	
}
}
