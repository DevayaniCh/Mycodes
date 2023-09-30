package com.marolix.basics;

public class TwoDimensionalArray 
{
	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5,6,7};
		System.out.println(a1[1]);
		
		
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(a[1]);
		System.out.println(a[1][2]);
		int b[][]=new int[5][4];
		System.out.println(b[0]);
		//System.out.println(b[0][1]);
		b[0][2]=55;
		b[1][1]=66;
		b[2][0]=43;
		b[3][2]=33;
		b[4][3]=55;
		System.out.println(b[0][2]);
		System.out.println(b[1][1]);
		System.out.println(b[2][0]);
		System.out.println(b[3][2]);
		System.out.println(b[4][3]);
		
		int ThreeD[][][]= {{{1,2},{34,44},{55,66}}, {{77,8},{99,100},{5}}, {{77},{78,87},{99}}};
		System.out.println(ThreeD[1][1][1]);
		System.out.println(ThreeD[2][2][0]); 
		System.out.println(ThreeD[0][2][1]);
		
		int ThreeD1[][][]=new int[2][3][3];
		System.out.println(ThreeD1[1]);
		ThreeD1[0][0][0]=59;
		ThreeD1[0][0][1]=79;
		ThreeD1[0][0][2]=89;
		System.out.println(ThreeD1[0][0][2]);
		System.out.println(ThreeD1[0][0][1]);
	}
}
