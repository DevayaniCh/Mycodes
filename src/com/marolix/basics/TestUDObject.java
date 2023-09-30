package com.marolix.basics;

public class TestUDObject 
{
	public static void main(String[] args) {
		Object o[]=new Object[9];
		o[1]=new UserDefinedObject(1, "dev");
		o[2]=new UserDefinedObject(2, "deva");
		o[3]=new UserDefinedObject(3, "devayani");
		o[4]=new Employee(101,"abc");
		o[5]=new Employee(102,"xyz");
		UserDefinedObject o1=(UserDefinedObject)o[1];
		o1.display();
		UserDefinedObject o2=(UserDefinedObject)o[2];
		o2.display();
		Employee e1=(Employee)o[4];
		e1.show();
		
		//o1.display();
		//o2.show();*/
		/*if (o[1] instanceof UserDefinedObject) {
			UserDefinedObject o1=(UserDefinedObject)o[1];
			o1.display();
		}
		/*UserDefinedObject u[]=new UserDefinedObject[6];
		u[1]=new UserDefinedObject(1, "dev");
		u[1].display();
		
		Employee e[]=new Employee[5];
		e[1]=new Employee(2, "deva");
		e[1].show();*/
		
		
}
}