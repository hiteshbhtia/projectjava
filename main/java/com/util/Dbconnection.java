package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection{
//	public static void main(String[] args) {
//	System.out.println(getConnection());	
//	}
	public static Connection getConnection() {
		Connection con=null;
		String driver="org.postgresql.Driver";
		String url="jdbc:postgresql://localhost:5432/employeesproj";
		String userName = "postgres";
		String password = "root";
		try {
			// load driver
			Class.forName(driver);

			// jdbc api open connection
			con = DriverManager.getConnection(url, userName, password);

			if (con == null) {
				System.out.println("db not connected");
			} else {
				System.out.println("db connected");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;

	}
}