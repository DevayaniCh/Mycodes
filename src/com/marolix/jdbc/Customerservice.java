package com.marolix.jdbc;


import java.util.List;

public interface Customerservice {
	public CustomerDTO registerCustomer(CustomerDTO dto);

	public String updateCustomer(String phoneNumber, String newContact);

	public List<CustomerDTO> viewAllCustomers();

	public CustomerDTO viewCustomer(String phoneNumber);

	public String deleteCustomer(String phoneNumber);
}
	




