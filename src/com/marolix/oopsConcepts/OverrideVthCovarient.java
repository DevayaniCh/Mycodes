package com.marolix.oopsConcepts;
class Bank{
	public Number balance() {
		System.out.println("it's just a bank which cannot have object");
		return 0;
	}
}
class AndhraBank extends Bank{
	public Float balance() {
		System.out.println("we can withdraw/deposit the amount");
		return 1000f;
	}
}
class SBI extends Bank{
	public Integer balance() {
		System.out.println("State Bank of India");
		return 100;
	}
}
public class OverrideVthCovarient {
	public static void main(String[] args) {
		Bank b=new AndhraBank();
		b.balance();
		Bank b1=new SBI();
		b1.balance();
	}

}
