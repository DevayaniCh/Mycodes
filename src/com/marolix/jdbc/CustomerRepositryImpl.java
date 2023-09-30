package com.marolix.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerRepositryImpl implements CustomerRepository
{
		@Override
		public Customer insertCustomer(Customer cust) {
			Connection c = null;
			try {
				c = DBConfiguration.connectDB();

				Statement st = c.createStatement();

				String query = "insert into customer(productId,customerName,gender,orderDate,contactNumber) values("+ cust.getProductId()+",\""
						+ cust.getcustomerName() + "\",\"" + cust.getGender() + "\",\"" + cust.getorderDate() + "\",\""
						+ cust.getContactNumber() + "\"" + ");";
				System.out.println(query);
				st.executeUpdate(query);
			} catch (ClassNotFoundException e) {

				System.out.println(e.getMessage());
			} catch (SQLException e) {

				System.out.println(e.getMessage());
			} finally {
				try {
					if (c != null || !c.isClosed()) {
						c.close();
					}
				} catch (SQLException e) {

					System.out.println(e.getMessage());
				}

			}
			return cust;
		}
		@Override
		public Customer readCustomerByPhoneNumber(String phoneNumber) {
			Connection c = null;
		    try {
		        c = DBConfiguration.connectDB();

		        Statement st = c.createStatement();
		        String query = "select * from customer where contactNumber = '" + phoneNumber + "';";
		        ResultSet rs = st.executeQuery(query);
		        
		        if (rs.next()) {
		            Customer customer = new Customer();
		            Integer pid = rs.getInt("productId");
		            String name = rs.getString("customerName");
		            Date date = rs.getDate("orderDate");
		            LocalDate dt = LocalDate.parse(date.toString());
		            String gender = rs.getString("Gender");

		            customer.setProductId(pid);
		            customer.setcustomerName(name);
		            customer.setOrderDate(dt);
		            customer.setContactNumber(phoneNumber);
		            
		            if (gender.equalsIgnoreCase("male"))
		                customer.setGender(Gender.MALE);
		            else if (gender.equalsIgnoreCase("female"))
		                customer.setGender(Gender.FEMALE);
		            else
		                customer.setGender(Gender.OTHERS);
		            return customer;
		        }
		    } catch (ClassNotFoundException | SQLException e) {
		        e.printStackTrace();
		    } finally {
		        try {
		            if (c != null || !c.isClosed()) {
		                c.close();
		            }
		        } catch (SQLException e) {
		            throw new RuntimeException(e.getMessage());
		            
		        }
		        
		        
		    }
		   return null; 
		  
		}
		@Override
		public void updatePhoneNumber(String oldPhoneNumber, String newPhoneNumber) {
			Connection c = null;
			try {
				c = DBConfiguration.connectDB();
				Statement st = c.createStatement();
String query = String.format("update customer set contactNumber=\"%s\" where contactNumber=\"%s\"",newPhoneNumber, oldPhoneNumber);
				st.executeUpdate(query);

			} catch (ClassNotFoundException | SQLException e) {
				//System.out.println(e.getMessage());
				throw new RuntimeException(e.getMessage());
			} finally {
				try {
					if (c != null || !c.isClosed()) {
						c.close();
					}
				} catch (SQLException e) {

					throw new RuntimeException(e.getMessage());
				}
			}

		}
		@Override
		public void deleteCustomer(String phoneNumber) {
			Connection c = null;
		    try {
		        c = DBConfiguration.connectDB();
		        Statement st = c.createStatement();
		        String query = "delete from customer where contactNumber = '" + phoneNumber + "';";
		        int rowsAffected = st.executeUpdate(query);

		        if (rowsAffected == 0) {
		            throw new RuntimeException("Customer not found for the given phone number.");
		        }
		    } catch (ClassNotFoundException | SQLException e) {
		        throw new RuntimeException(e.getMessage());
		    } finally {
		        try {
		            if (c != null || !c.isClosed()) {
		                c.close();
		            }
		        } catch (SQLException e) {
		            throw new RuntimeException(e.getMessage());
		        }
		    }
		}

		@Override
		public List<Customer> readAllCustomer() {
				List<Customer> list = new ArrayList<Customer>();
				Connection c = null;
				try {
					c = DBConfiguration.connectDB();

					Statement st = c.createStatement();
					String query = "select * from customer;";
					System.out.println(query);
					ResultSet rs = st.executeQuery(query);
					while (rs.next()) {
						Customer s = new Customer();
						//Integer cid=rs.getInt(1);
						Integer pid=rs.getInt(2);
						String name = rs.getString("customerName");
						//Integer id = rs.getInt(1);
						Date date = rs.getDate("orderDate");
						// String date = rs.getString("Date_of_admission");
						LocalDate dt = LocalDate.parse(date.toString());
						s.getOrderDate();
						String phonenumber = rs.getString(6);
						String gender = rs.getString("Gender");
						if (gender.equalsIgnoreCase("male"))
							s.setGender(Gender.MALE);
						else if (gender.equalsIgnoreCase("female"))
							s.setGender(Gender.FEMALE);
						else
							s.setGender(Gender.OTHERS);
						
						//s.setCustomerId(cid);
						s.setProductId(pid);
						s.setcustomerName(name);
						s.setOrderDate(dt);
						s.setContactNumber(phonenumber);
						list.add(s);
					}
				} catch (ClassNotFoundException | SQLException e) {

					e.printStackTrace();
				} finally {
					try {
						if (c != null || !c.isClosed()) {
							c.close();
						}
					} catch (SQLException e) {

						throw new RuntimeException(e.getMessage());
					}
				
			}
			return list;
		}

	}

