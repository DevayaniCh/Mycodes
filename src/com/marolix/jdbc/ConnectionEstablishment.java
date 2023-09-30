package com.marolix.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionEstablishment 
{
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306?user=root&password=6300";
	String query2 ="insert into employee.emp values(4,'devayani1','tester',50000)";
	String query1 ="insert into employee.emp values(5,'devayani2','support',40000)";
	try {
		Connection connection=DriverManager.getConnection(url);
		System.out.println("Connection established");
		Statement statement =connection.createStatement();
		System.out.println("platform created");
		statement.executeUpdate(query2);
		statement.executeUpdate(query1);
		System.out.println("query exceuted");
		System.out.println("records inserted in a database");
		connection.close();
		System.out.println("connection closed");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
