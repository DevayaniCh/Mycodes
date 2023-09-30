package com.marolix.oopsConcepts;
class Employement{
	public void job() {
		System.out.println("Every human will be having employement");
	}
}
class Engineer extends Employement{
	public final void job() {
		System.out.println("Java Developer");
	}
}
public class FinalModifier 
{
public static void main(String[] args) {
	Employement e=new Engineer();
	e.job();
}
}
