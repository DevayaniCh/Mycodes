package com.marolix.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDemo 
{
		public static void main(String[] args) throws ClassNotFoundException, SQLException {

			Class.forName("com.mysql.cj.jdbc.Driver");
			// Class.forName("java.lang.Strings1");
			String url = "jdbc:mysql://localhost:3306/practisemysql";
			String username = "root";
			String password = "6300";

			Connection c = DriverManager.getConnection(url, username, password);

			Statement st = c.createStatement();
			String s = "select * from student;";
			String insert = "insert into student values(108,\"manitha\",\"female \",\"1234567890\",\"90\",\"p\");";
			int a = st.executeUpdate(insert);
			ResultSet rs = st.executeQuery(s);
			 
			// System.out.println(a);
			 //System.out.println(rs.next());

			while (rs.next()) {
				int stdId = rs.getInt(1);
				String sName = rs.getString(2);
				String Gender = rs.getString(3);
				String mobileNumber = rs.getString(4);
				float percentage = rs.getFloat(5);
				String fee=rs.getString(6);
				System.out.println("stdent_id = " + stdId + " studentname = " + sName + " gender= " + Gender
						+ " MNumber = " + mobileNumber + " percentge = " + percentage +" fee "+fee);
}

		}

	}

