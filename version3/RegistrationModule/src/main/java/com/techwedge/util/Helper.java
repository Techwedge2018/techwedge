package com.techwedge.util;

import java.sql.Connection;
import java.sql.Statement;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {
	
	 public static final String USER = "root";
	 public static final String PASS = "root";
	 public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	 public static final String DB_URL = "jdbc:mysql://localhost/registration";
	 static Connection conn=null;
	 static Statement stmt=null;
	 
	 public static Object createConnection() {
		 try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		     conn = DriverManager.getConnection(DB_URL,USER,PASS);
		     stmt=conn.createStatement();
		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }//end try
		   System.out.println("Successfully Connected!");
		   return stmt;
		
	 }
	 
	 public static void closeConnection() {
		 try {
			 conn.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		     
		   }//end try
		   System.out.println("Successfully Disconnected!");
		   return;
		 
		 
	 }

	
	

}
