package com.marolix.oopsConcepts;
abstract class Education{
	public abstract void study();
}
class Btech extends Education{
	public void study() {
		System.out.println("Completed btech in ECE");
	}
}
abstract class Mtech extends Education{
	public abstract void study();
}
public class AbstractOverriding {
public static void main(String[] args) {
	Education e=new Btech();
	e.study();
}
}
