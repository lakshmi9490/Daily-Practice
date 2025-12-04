package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MetaData {
	static String url = "jdbc:mysql://localhost:3306/demo";
	static String username = "root";
	static String password = "root";
	
	static Connection con ;
	static Statement stmt;
	static ResultSet res;
	static ResultSetMetaData md;
	
	static String q = "select * from restaurant";
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
			stmt = con.createStatement();
			res = stmt.executeQuery(q);
			
			 md= res.getMetaData();
			 
			 int count = md.getColumnCount();
			 
			 for(int i=1;i<=count;i++) {
				System.out.print(md.getColumnName(i)+" "+md.getColumnTypeName(i)+" ");
			 }
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
