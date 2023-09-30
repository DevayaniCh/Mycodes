package com.marolix.modifiers2;

public class Restaurent2 extends Restaurent
{
	public  void bill() {
		int chickenBiryani=180;
		int chickenJoint=240;
		int starters=550;
		int softdrink=25;
		double total=chickenBiryani+chickenJoint+starters+softdrink;
		System.out.println("After overridden the bill is "+total);
	}
}
