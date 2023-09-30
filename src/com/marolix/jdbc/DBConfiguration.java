package com.marolix.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DBConfiguration 
{

		private DBConfiguration() {
		
		}

		public static Connection connectDB() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/practisemysql";
			String username = "root";
			String password = "6300";

			Connection c = DriverManager.getConnection(url, username, password);
			return c;
		}
	}

