package com.marolix.basics;

import java.util.List;

class Car{
	
}
class Aeroplane{
	
}
class Bike{
	
}
public class InstanceofOperator
{
public static void main(String[] args) 
{
Car c=new Car();
Object o[]= {c, new Aeroplane(),new Bike(),new String(),new Thread()};
Object o1=o[1];
System.out.println(o1 instanceof Aeroplane);
if(o1 instanceof Car)
{
	System.out.println("it is a instance of car");
}
else
{
	System.out.println("it is not an instance of car");
	System.out.println("its is an instance of"+o1.toString());

}
}
}
