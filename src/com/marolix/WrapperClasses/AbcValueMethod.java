package com.marolix.WrapperClasses;

public class AbcValueMethod {
public static void main(String[] args) {
	Integer i=Integer.valueOf(10);
	int i1=i.intValue();
	byte i2=i.byteValue();
	short i3=i.shortValue();
	long i4=i.longValue();
	double i5=i.doubleValue();
	float i6=i.floatValue();
	System.out.println(i1+" "+i2+" "+i3+" "+i4+" "+i5+" "+i6);
	
	System.out.println(10/20.0);
	System.out.println(10%20.0);
}
}
