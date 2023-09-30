package com.marolix.basics;

public class Variables 
{
	//BankAccount Example(static variable)
	static String bankName="SBI";
	static String iFSC="SBIN0010357";
	//instance variables
	String accountHolder;
	long accountNumber;
	double balance;
	public Variables(String accountHolder, long accountNumber, double balance) 
	{
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void show()
	{
		//local variable
		String type="Savings";
		System.out.println("Bank Name is "+bankName+" and it consists an IFSC "+iFSC+" Account Holder is "+accountHolder+" the account number is"+accountNumber+" and it is having the balance amount of "+balance+" and Account type is "+type);
	}
}

