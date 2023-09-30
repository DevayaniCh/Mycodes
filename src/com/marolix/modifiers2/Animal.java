package com.marolix.modifiers2;
class Tiger extends Animal{
	double waterDrink=75;
}
class Lion extends Animal{
	double waterDrink=80;
}
public class Animal {
public static void main(String[] args) {
	Lion a=new Lion();
	System.out.println(a.waterDrink);
	
	Animal a1=new Lion();
	System.out.println(a1.waterDrink);
	
}
}
