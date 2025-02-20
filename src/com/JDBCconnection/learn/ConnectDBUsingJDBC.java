package com.JDBCconnection.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDBUsingJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/education";
		String username = "root";
		String password = "tccs";
		
		
		
		//Establish a connection to the Database
		try {
			
			//Load the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url,username,password);
			
			//Create a Statement
			Statement statement = connection.createStatement();
			
			//SQL Queries for execute
			String query = "Select * from employee";
			
			ResultSet resultset = statement.executeQuery(query);
			
			while(resultset.next()) {
				
				int id = resultset.getInt("id");
				String emp_id = resultset.getString("emp_id");
				String emp_name = resultset.getString("emp_name");
				String emp_designation = resultset.getString("designation");
				
				System.out.println("Emp_ID: "+emp_id+" emp_name: "+emp_name+" emp_designation: "+emp_designation);
			}
			
			//close the connection
			resultset.close();
			statement.close();
			connection.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
