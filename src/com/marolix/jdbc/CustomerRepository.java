package com.marolix.jdbc;
import java.util.List;
public interface CustomerRepository
{

	public Customer insertCustomer(Customer cust);

	public List<Customer> readAllCustomer();
	
	public Customer readCustomerByPhoneNumber(String phoneNumber);

	public void updatePhoneNumber(String phoneNumer, String phoneNumber);

	public void deleteCustomer(String phoneNumber);
	
	}

