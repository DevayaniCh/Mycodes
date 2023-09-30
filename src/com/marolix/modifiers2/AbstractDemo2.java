package com.marolix.modifiers2;

public class AbstractDemo2 extends AbstractDemo
{
public void m1() {
	System.out.println("This is an implementation of incomplete abstract method");
}
public static void main(String[] args) {
	AbstractDemo a1=new AbstractDemo2();
	a1.m1();
}
}
