package com.techwedge;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;

import com.mysql.jdbc.PreparedStatement;
import com.sun.corba.se.spi.orbutil.fsm.State;


public class LoginDao1 {
	public boolean validatelogin(LoginDto1 logindto)
	{
		boolean returnflag=false;
		 final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		    final String DB_URL = "jdbc:mysql://localhost/registration";
		    	
		   //  Database credentials
		    final String USER = "root";
		    final String PASS = "root";
		   
		   Connection conn = null;
		   Statement stmt = null;
		   Statement ust=null;
		   Statement cst=null;
		   ResultSet rs=null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		     // System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);

		      //STEP 4: Execute a query
		      //System.out.println("Creating statement...");
		      stmt = conn.createStatement();
		      String sql;
		      Encryption encry=new Encryption();
		      String enpwd;
		      enpwd=encry.encrypt(logindto.getPassword());
		      System.out.println(enpwd);
		      rs = stmt.executeQuery("SELECT * from usertable where username='"+logindto.getUsername()+"' and password='"+enpwd+"'" );
		     
		    //sql="SELECT * FROM usertable where username ='"+logindto.getUsername()+"'";	  
		    System.out.println(logindto.getUsername());
		     // rs = stmt.executeQuery(sql);
			     System.out.println(rs);
			    
		      //STEP 5: Extract data from result set
		      if(rs.next()){
		    	  int uid=rs.getInt("userid");
			      rs = stmt.executeQuery("SELECT contactid from contactstable where userid='"+uid+"'" );
			      int cid=rs.getInt("contactid");
			      
			      rs=stmt.executeUpdate("INSERT INTO useraudittable (userid,lastlogin,contactid)"+"values('"+uid+"','"+now()+"','"+cid+"')");
		    	  System.out.println(rs.getInt("userid"));
		    	  
		    	  
		      returnflag=true;
		      
		         }
		      else
		    	 returnflag=false;
		      //STEP 6: Clean-up environment
		      rs.close();
		      stmt.close();
		      conn.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
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
		   //System.out.println("Goodbye!");
		   return returnflag;

	}

	
}
