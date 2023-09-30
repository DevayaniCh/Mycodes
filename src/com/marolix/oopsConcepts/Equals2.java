package com.marolix.oopsConcepts;
class Student{
	String sName;
	int sId;
	public Student(String sName, int sId) {
		super();
		this.sName = sName;
		this.sId = sId;
	}
	public boolean equals(Student std) {
		return this.sId==std.sId;
		
	}
}
public class Equals2 
{
public static void main(String[] args) {
	String s="devayani";
	String s1="devayani";
	System.out.println(s==s1);
	
	String s2=new String("devayani");
	String s3=new String("devayani");
	System.out.println(s2==s3);
	
	System.out.println(s2.equals(s3));
	
	Student s4=new Student("dev",1);
	Student s5=new Student("deva",2);
	System.out.println(s4.equals(s5));
	
}
}
