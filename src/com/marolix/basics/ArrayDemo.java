package com.marolix.basics;

public class ArrayDemo 
{
	public static void main(String[] args) {
		int a[][]= new int[5][];
		System.out.println(a.getClass().getName());
		boolean b[][]=new boolean[5][];
		System.out.println(b.getClass().getName());
		byte b1[][]=new byte[5][];
		System.out.println(b1.getClass().getName());
		short s[][]=new short[5][];
		System.out.println(s.getClass().getName());
		long l[][]=new long[5][];
		System.out.println(l.getClass().getName());
		double d[][]=new double[5][];
		System.out.println(d.getClass().getName()); 
	}
}
