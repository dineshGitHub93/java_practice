package com.JDBCconnection.learn;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionUsingJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/education";
		String username = "root";
		String password = "tccs";
		
		try {
			
			//Load a driver to Database
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish a connection 
			Connection connection = DriverManager.getConnection(url,username,password);
			
			//Disable auto commit to start a transactions
			connection.setAutoCommit(false);
			
			//Query for insert
			//String query = "INSERT INTO employee (emp_id, emp_name, designation) VALUES(?,?,?)";
			
			String query = "UPDATE employee SET emp_id = ? where emp_name= ";
			
			//Create a preparedStatement
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			//Insert multiple records
			preparedStatement.setString(1, "tp008");
			preparedStatement.setString(2, "Ankita");
			preparedStatement.setString(3, "HR.Manager");
			preparedStatement.execute();
			
			preparedStatement.setString(1, "tp009");
			preparedStatement.setString(2, "Juhi");	
			preparedStatement.setString(3, "Jr.HR");
			preparedStatement.execute();
			
			//Commit the transaction
			connection.commit();
			System.out.println("Transaction committed.");
			
			//close the connection
			preparedStatement.close();
			connection.close();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
