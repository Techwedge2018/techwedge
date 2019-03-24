package com.techwedge;

import java.sql.DriverManager;
import java.io.IOException;  
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.ConnectionImpl;
//import com.mysql.jdbc.PreparedStatement;  
import java.sql.PreparedStatement;

public class registerDAO {
	
	
	public User addToDB(User usr) {
		/*String userName;
		String userEmail; 
		String userPassword;*/
		
	
	// JDBC driver name and database URL
	   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   final String DB_URL = "jdbc:mysql://localhost/registration";

	   //  Database credentials
	   final String USER = "root";
	   final String PASS = "root";
	   
	  
	   Connection conn = null;
	   Statement stmt = null;
	   
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);

	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      stmt = conn.createStatement();
	      
	      Encryption encry=new Encryption();
	      String enpwd;
	      enpwd=encry.encrypt(usr.getPassword());
	      //stmt.executeUpdate("INSERT INTO usertable(userid,name,username,password)"+"values('"+usr.getUserid()+"','"+usr.getName()+"','"+usr.getUsername()+"','"+usr.getPassword()+"')");
	     // stmt.executeUpdate("INSERT INTO usertable(name,username,password)"+"values('"+usr.getName()+"','"+usr.getUsername()+"','"+usr.getPassword()+"')");
	    String type="C";
	      stmt.executeUpdate("INSERT INTO usertable(name,username,password,type,status)"+"values('"+usr.getName()+"','"+usr.getUsername()+"','"+enpwd+"','"+type+"','"+1+"')");

	      
	      
	     // userName=user.getName();
	      //userEmail=user.getUsername();
	      //userPassword=user.getPassword();
	      //sql="INSERT INTO usertable ( `name`, `username`, `password`) VALUES ( `usr.getName`, `usr.getUsername`, `usr.getPassword`)";
	      
	      
	      /*sql="INSERT INTO usertable (name, username, password)"+"VALUES(?,?,?)";
	      PreparedStatement pst=conn.prepareStatement(sql);
	    		  
	    		  
	      pst.setString(1, usr.getName());
	      pst.setString(2, usr.getUsername());
	      pst.setString(3, usr.getPassword());
	      pst.executeUpdate();*/
	      
	      /*sql="INSERT INTO usertable (name, username, passwoed)"+"VALUES(usr.getName(), usr.getUsername(), usr.getPassword())";
	      stmt.executeUpdate(sql);	    */  
	      System.out.println("Success");
	      //ResultSet rs = stmt.executeUpdate(sql);

	      //STEP 5: Extract data from result set
	     /* if(rs.next()){
	        f=true;
	      }
	      else
	      {
	    	  f=false;
	         
	      }*/
	      //STEP 6: Clean-up environment
	      //rs.close();
	     // pst.close();
	      stmt.close();
	      conn.close();
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	      //return false;
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            stmt.close();
	      }catch(SQLException se2){
	      }// nothing we can do
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("\nGoodbye!");
	   return usr;
	
	}//end JDBCSample


}

//INSERT INTO `registration`.`usertable` (`userid`, `name`, `username`, `password`) VALUES ('01', 'uuserName', 'userEmail', 'userPassword');
//`registration`.
