package com.marolix.jdbc;
import java.time.LocalDate;

public class CustomerDTO
{
	private Integer customerId;
	private Integer productId;
	private String customerName;
	private Gender gender;
	private LocalDate orderDate;
	private String contactNumber;

		public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


		public CustomerDTO(Integer productId, String customerName, Gender gender, LocalDate orderDate,
			String contactNumber) {
		super();
		this.productId = productId;
		this.customerName = customerName;
		this.gender = gender;
		this.orderDate = orderDate;
		this.contactNumber = contactNumber;
	}

		public CustomerDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

		

		@Override
		public String toString() {
			return "CustomerDTO [productId=" + productId + ", customerName=" + customerName + ", gender=" + gender
					+ ", orderDate=" + orderDate + ", contactNumber=" + contactNumber + "]";
		}

		
		public Integer getCustomerId() {
			return customerId;
		}

		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
		}

		public CustomerDTO(Integer customerId, Integer productId, String customerName, Gender gender,
				LocalDate orderDate, String contactNumber) {
			super();
			this.customerId = customerId;
			this.productId = productId;
			this.customerName = customerName;
			this.gender = gender;
			this.orderDate = orderDate;
			this.contactNumber = contactNumber;
		}

	}

