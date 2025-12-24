package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
	
	 static String url ="jdbc:mysql://localhost:3306/demo";
	 static String username = "root";
	 static String password = "root";
	 private static Connection con;
	 private static Statement stmt;
	 private static String q = "insert into restaurant (restaurant_id,name,cuisine_type,rating,isActive)"+
	 " values (10,'Chillies','Indian',4.55,0)";
	 
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
			stmt = con.createStatement();
			stmt.executeUpdate(q);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
