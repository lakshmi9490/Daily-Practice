package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class IAcceptingData {
	static String url = "jdbc:mysql://localhost:3306/demo";
	static String username = "root";
	static String password = "root";
	static Connection con ;
	static PreparedStatement pstmt;
	static String q = "insert into restaurant(restaurant_id,name,cuisine_type,rating,isActive) values(?,?,?,?,?)";
	
	public static void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		int restaurant_id = sc.nextInt();
		String name = sc.next();
//		sc.nextLine();
		String cuisine_type = sc.next();
//		sc.nextLine();
		float rating = sc.nextFloat();
		int isActive = sc.nextInt();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
			pstmt = con.prepareStatement(q);
			pstmt.setInt(1, restaurant_id);
			pstmt.setString(2, name);
			pstmt.setString(3, cuisine_type);
			pstmt.setFloat(4, rating);
			pstmt.setInt(5,isActive);
			
			pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		sc.close();
	}
}
