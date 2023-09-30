package com.marolix.basics;

public class Employee 
{
	int empId;
	String eName;
	public Employee(int empId,String eName)
	{	
		this.empId=empId;
		this.eName=eName;
	}
	public void show()
	{
		System.out.println("Employee id is "+empId+" and his/her name is "+eName);
	}
}
