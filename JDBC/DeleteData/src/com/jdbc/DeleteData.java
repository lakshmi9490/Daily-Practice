package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {
	static String url = "jdbc:mysql://localhost:3306/demo";
	static String username = "root";
	static String password = "root";
	
	static Connection con ;
	static PreparedStatement pstmt;
	
	static String q = "delete from restaurant where restaurant_id = ?";
	
	public static void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you want to delete :");
		int restaurant_id = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			pstmt = con.prepareStatement(q);
			pstmt.setInt(1, restaurant_id);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		sc.close();
	}
}
