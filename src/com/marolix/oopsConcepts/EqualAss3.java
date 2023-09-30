package com.marolix.oopsConcepts;
class Manager{
	int mId;
	String mName;
	public Manager(int mId, String mName) {
		super();
		this.mId = mId;
		this.mName = mName;
	}
}
class Employee{
	int eId;
	String eName;
	public Employee(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}
	public boolean equals(Employee emp) {
		return this.eId==emp.eId;
	}
}
public class EqualAss3 
{
	
public static void main(String[] args) {
	Manager m=new Manager(101, "xyz");
	Manager m1=new Manager(102, "abc");
	Employee e=new Employee(101, "qwe");
	Employee e1=new Employee(102, "rty");
	System.out.println(e.equals(m));
}
}
