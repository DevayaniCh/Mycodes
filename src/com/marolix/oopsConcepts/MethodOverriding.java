package com.marolix.oopsConcepts;
class ANU {
	public void name() {
		System.out.println("ANU is a parent class");
	}
}
class Ciet extends ANU{
	public void name() {
		System.out.println("Ciet is a child class");
	}
}
public class MethodOverriding {
public static void main(String[] args) {
	ANU a =new Ciet();
	a.name();
}
}
