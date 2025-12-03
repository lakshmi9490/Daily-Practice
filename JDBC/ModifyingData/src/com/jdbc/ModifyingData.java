package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ModifyingData {
	
	static String url = "jdbc:mysql://localhost:3306/demo";
	static String username = "root";
	static String password = "root";
	static Connection con;
	static PreparedStatement pstmt;
	static String q = "update restaurant set name = ? where restaurant_id= ? ";
	
	public static void main(String[] args) {
		String name = "Table9";
		int restaurant_id =10;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
			pstmt = con.prepareStatement(q);
			pstmt.setString(1, name);
			pstmt.setInt(2, restaurant_id);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
