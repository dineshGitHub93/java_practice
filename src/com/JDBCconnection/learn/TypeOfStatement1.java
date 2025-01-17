package com.JDBCconnection.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TypeOfStatement1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		//Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education", "root", "tccs");
		
		//create a statement
		Statement st = con.createStatement();
		
		//execute the query
		ResultSet rs = st.executeQuery("Select * From user_dlt");
		
		while(rs.next()) {
			
			System.out.println("ID : "+rs.getString("ID")+" Name : "+rs.getString("name"));
		}
		st.close();
		con.close();

	}

}
