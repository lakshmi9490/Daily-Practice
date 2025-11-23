package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyConnection {
	
	static Connection con;
	
	public static Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection(Credentials.url,Credentials.username,Credentials.password);
		    
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return con;
	}
	public static void closeConnection(ResultSet resultset,Statement stmt,Connection con) {
		try {
			if(resultset != null) {
				resultset.close();
				System.out.println("ResultSet is closed");
			}
			if(stmt != null) {
				stmt.close();
				System.out.println("Statement is closed");
			}
			if(con != null) {
				con.close();
				System.out.println("Connection is closed");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
