package com.marolix.basics;

public class CompoundOperator 
{
public static void main(String[] args) {
byte b=126;
b+=2;// internally b=b+2;
System.out.println(b);

byte a=126;
a-=2;
System.out.println(a);

byte c=126;
c*=2;
System.out.println(c);

byte d=126;
d/=2;
System.out.println(d);

byte e=126;
e%=2;
System.out.println(e);
}
}
