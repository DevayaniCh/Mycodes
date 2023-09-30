package com.marolix.jdbc;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class UI {
	private static Customerservice customerService = new CustomerServiceImpl();

	public static void main(String[] args) {
		//registerCustomer();
		//readAllvalues();
		//updateDetails();
		readOneDetail();
		//deleteCustomer();
	}

	public static void registerCustomer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter product id");
		Integer productId = sc.nextInt();
		System.out.println("enter Customer Name");
		String customerName = sc.next();
		System.out.println("Enter contact Number");
		String contactNumber=sc.next();
		LocalDate orderDate = LocalDate.now();
		System.out.println("select gender M for male F female O for others");
		String genderid = sc.next();
		//int genderid = sc.nextInt();
		Gender gender = null;
		if (genderid.equals("M"))
			gender = Gender.MALE;
		else if (genderid.equals("F"))
			gender = Gender.FEMALE;
		else if (genderid.equals("O"))
			gender = Gender.OTHERS;
	

		CustomerDTO dto = new CustomerDTO(productId,customerName,gender,orderDate,contactNumber);
        System.out.println(dto);
		dto = customerService.registerCustomer(dto);
		System.out.println("Customer ordered succssfully with details : " + dto);
	}
	public static void readAllvalues() {

		List<CustomerDTO> ldto = customerService.viewAllCustomers();
		for (CustomerDTO s : ldto) {
			System.out.println(s);
		}
	}
	public static void updateDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your phone number");
		String phonenumber = sc.next();
		System.out.println("enter your new phone number");
		String newnum = sc.next();
		String message = customerService.updateCustomer(phonenumber, newnum);
		System.out.println(message);
	}
	public static void readOneDetail() {
		
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter phone number to search for customer:");
		    String phoneNumber = sc.next();
		        CustomerDTO customerDTO = customerService.viewCustomer(phoneNumber);
		        System.out.println("Customer details:");
		       // System.out.println("Product ID: " + customerDTO.getProductId()+"Customer Name: "+ customerDTO.getCustomerName()+"Gender: " + customerDTO.getGender()+"Order Date: " + customerDTO.getOrderDate()+"Contact Number: " + customerDTO.getContactNumber());
		  		System.out.println(customerDTO);
	}
	
	public static void deleteCustomer() {
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter phone number of the customer to delete:");
	    String phoneNumber = sc.next();
	    try {
	        String message = customerService.deleteCustomer(phoneNumber);
	        System.out.println(message);
	    } catch (RuntimeException e) {
	        System.out.println(e.getMessage());
	    }
	}
	}
	




