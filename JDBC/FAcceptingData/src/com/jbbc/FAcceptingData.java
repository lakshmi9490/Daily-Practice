package com.jbbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FAcceptingData {
	static String url = "jdbc:mysql://localhost:3306/Demo";
	static String username = "root";
	static String password = "root";
	static Connection con;
	static PreparedStatement pstmt;
	static ResultSet res;
	static String q = "select * from restaurant where restaurant_id = ?";
	private static int restaurant_id =1;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(url,username,password);
			 pstmt = con.prepareStatement(q);
			 pstmt.setInt(1,restaurant_id);
			res = pstmt.executeQuery();
			if(res.next()) {
				System.out.println(res.getInt(1)+" "+
								res.getString(2)+" "+
								res.getString(3)+" "+
								res.getFloat(4)
								);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
