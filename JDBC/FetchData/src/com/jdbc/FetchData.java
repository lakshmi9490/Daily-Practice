package com.jdbc;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

public class FetchData {

    static Connection con;
	static Statement stmt;
	static ResultSet resultset ;

	public static void main(String[] args) {
	    

		try {
			 con = MyConnection.connect();
			
			 stmt = con.createStatement();
			 
			 resultset = stmt.executeQuery("select * from restaurant");
			 
			 while(resultset.next()) {
				 System.out.println(
						 resultset.getInt(1)+" "
						 +resultset.getString("name")+" "
						 +resultset.getString("rating"));
			 }
			 
			System.out.println("_____________________________");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		finally{
			MyConnection.closeConnection(resultset,stmt,con);
		}
		

	}

}
