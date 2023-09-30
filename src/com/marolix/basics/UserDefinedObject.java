package com.marolix.basics;

public class UserDefinedObject 
{
	int no;
	String name;
	public UserDefinedObject(int no,String name) 
	{	
		this.no=no;
		this.name=name;
	}
	public void display()
	{
		System.out.println("RollNo is "+no+"  and his/her name is "+name);
		
	}
}
