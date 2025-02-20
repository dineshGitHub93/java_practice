package com.JDBCconnection.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDataUsingJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/education";
		String username = "root";
		String password = "tccs";
		
		try {
			//Load the driver to Database
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish a connection 
			Connection connection = DriverManager.getConnection(url,username,password);
			
			//Create Update Query
			String update_query = "UPDATE employee SET designation = ? where emp_id = ?";
			
			//create a prepared statement 
			PreparedStatement preparedStatement = connection.prepareStatement(update_query);
			
			//Set parameters and execute SQL 
			preparedStatement.setString(1, "Director");
			preparedStatement.setString(2, "tp005");
			int rowInserted = preparedStatement.executeUpdate();
			System.out.println("Row inserted : "+rowInserted);
			
			//close the connection
			preparedStatement.close();
			connection.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
