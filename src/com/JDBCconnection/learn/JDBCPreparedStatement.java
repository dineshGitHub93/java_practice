package com.JDBCconnection.learn;

import java.io.FilterWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCPreparedStatement {
	
	public static void main(String args[]) {
		
		String url = "jdbc:mysql://localhost:3306/education";
		String username ="root";
		String password ="tccs";
		
		
		try {
			//Load the driver to Database
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish a connection to connect DB
			Connection connection = DriverManager.getConnection(url,username, password);
			
			//Insert Queries 
			String insert_intoDB = "INSERT INTO employee (emp_id, emp_name, designation) VALUES(?,?,?)";
			
			//Create prepared statement
			PreparedStatement preparedStatement = connection.prepareStatement(insert_intoDB);
			
			//Set parameter and execute SQL Query
			preparedStatement.setString(1, "tp008");
			preparedStatement.setString(2, "Cena");
			preparedStatement.setString(3, "DevOps Engineer");
			int rowInserted = preparedStatement.executeUpdate();
			System.out.println("row Inserted : "+rowInserted);
			
			//Close the connections
			preparedStatement.close();
			connection.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
