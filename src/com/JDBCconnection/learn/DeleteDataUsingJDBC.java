package com.JDBCconnection.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDataUsingJDBC {
	
	public static void main(String args[]) {
		
		String url = "jdbc:mysql://localhost:3306/education";
		String username = "root";
		String password = "tccs";
	
		try {
			
			//Load the driver to Database
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish a connection
			Connection connection = DriverManager.getConnection(url,username,password);
			
			//Query for Delete Data from DB
			String delete_query = "DELETE FROM employee where emp_id = ?";
			
			//Create a prepared Statement
			PreparedStatement preparedStatement = connection.prepareStatement(delete_query);
			
			preparedStatement.setString(1, "tp006");
			int rowInserted = preparedStatement.executeUpdate();
			System.out.println("Row Inserted :"+rowInserted);
			
			// close the connection
			preparedStatement.close();
			connection.close();
			
		}catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	
	
	}

}
