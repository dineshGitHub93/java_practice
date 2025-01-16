package com.JDBCconnection.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveInfoFromDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/education"; //DB details
		String userName = "root"; //User Name
		String userPassword = "tccs"; //User Password
		String query = "Select * from user_dlt";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, userName, userPassword);
		
		System.out.println("Connection established successfully ");

		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			String name = rs.getString("name");
			System.out.println(name);
		}
		
		
		st.close();
		con.close();
		System.out.println("Connection closed successfully ");
		
	}

}
