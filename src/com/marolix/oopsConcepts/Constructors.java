package com.marolix.oopsConcepts;

public class Constructors 
{
	 int i;
     char j;
     public Constructors(int i, char j) {
		super();
		this.i = i;
		this.j = j;
		System.out.println("i is"+i+"and j is "+j);
	}
     public Constructors(int i) {
    	 this.i=i;
    	 System.out.println(" i is "+i);
     }
	public static void main(String[] args) {
		Constructors c = new Constructors(1,'a');
		Constructors c1 = new Constructors(2,'b');
		Constructors c2=new Constructors(3);

	}
}
