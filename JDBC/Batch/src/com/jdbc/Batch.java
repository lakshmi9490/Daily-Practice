package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Batch {
	static String url = "jdbc:mysql://localhost:3306/demo";
	static String username = "root";
	static String password = "root";
	static Connection con ;
	static PreparedStatement pstmt;
	static Statement stmt;
	
	static String s= "insert into employee (user_id,name,design,salary) values (?,?,?,?)";
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
			pstmt = con.prepareStatement(s);
			System.out.println("Enter how many employee you are adding :");
				int n = sc.nextInt();
				
		 for(int i=1;i<=n;i++) {
			 
			 int id = sc.nextInt();
			 sc.nextLine();
			 String name = sc.nextLine();
			 String design = sc.nextLine();
			 int salary = sc.nextInt();
			 
			pstmt.setInt(1,id );
			pstmt.setString(2, name);
			pstmt.setString(3,design);
			pstmt.setInt(4, salary);
			
			pstmt.addBatch();
			System.out.println("Batch "+i+" is added");
		 }

			pstmt.executeBatch();
			
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		sc.close();

	}

}
