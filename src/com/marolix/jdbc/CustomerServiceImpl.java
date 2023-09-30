package com.marolix.jdbc;


import java.util.List;
import java.util.stream.Collectors;

public class CustomerServiceImpl implements Customerservice {
	private CustomerRepository srepo = new CustomerRepositryImpl();

	@Override
	public CustomerDTO registerCustomer(CustomerDTO dto) {
		Customer s = new Customer();
		System.out.println(dto.getOrderDate());
		s.setCustomerId(dto.getCustomerId());
		s.setProductId(dto.getProductId());
		
		s.setcustomerName(dto.getCustomerName());
		s.setContactNumber(dto.getContactNumber());
		s.setOrderDate(dto.getOrderDate());
		s.setGender(dto.getGender());
		srepo.insertCustomer(s);
		return dto;
	}

	@Override
	public String updateCustomer(String phoneNumber, String newContact) {
		srepo.updatePhoneNumber(phoneNumber, newContact);
		return "phone number updated successfully";
	}

	@Override
	public List<CustomerDTO> viewAllCustomers() {
			List<Customer> list = srepo.readAllCustomer();
			if (list.isEmpty())
				throw new RuntimeException("no student details found");
			// Integer student_id, String studentName, Gender gender, LocalDate doj, String contactNumber
			
			return list
					.stream().map(customer -> new CustomerDTO(customer.getCustomerId(), customer.getProductId(),
							customer.getCustomerName(), customer.getGender(), customer.getorderDate(),customer.getContactNumber()))
					.collect(Collectors.toList());
	}

	@Override
	public CustomerDTO viewCustomer(String phoneNumber) 
	{
		 Customer customer = srepo.readCustomerByPhoneNumber(phoneNumber);
		    if (customer == null) {
		        throw new RuntimeException("Customer not found for phone number: " + phoneNumber);
		    }
		    return new CustomerDTO(customer.getCustomerId(), customer.getProductId(),
		            customer.getCustomerName(), customer.getGender(), customer.getorderDate(), customer.getContactNumber());
	}
	

	@Override
	public String deleteCustomer(String phoneNumber) {
		CustomerDTO customerToDelete = viewCustomer(phoneNumber);
	    
	    if (customerToDelete == null) {
	        throw new RuntimeException("Customer not found for the given phone number.");
	    }
	    srepo.deleteCustomer(phoneNumber);
	    return "Customer with phone number " + phoneNumber + " has been deleted.";
	}
	
	}



