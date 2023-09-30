package com.marolix.modifiers2;

strictfp class StrictfpDemo //class level strictfp we can add individual methods too
{
public static void main(String[] args) {
StrictfpDemo s=new StrictfpDemo();
s.add();
s.add1();
s.add3();
System.out.println(TransientDemo.i);
}
public void add() {
	int a=20/30;
	System.out.println(a);
}
public void add1() {
	int a=20/10;
	System.out.println(a);
}
public void add3() {
	int a=20/5;
	System.out.println(a);
}
}
