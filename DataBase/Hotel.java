import java.sql.*;
import java.util.Scanner;
 class Hotel {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
   static String DB_URL = "jdbc:mysql://localhost:3306/";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "root";
   
   public static void main(String[] args) 
   {
	   Scanner sc = new Scanner(System.in);
	  System.out.print("Conform that you have Stsrted Server type [Y/N]:");
	  String s = sc.nextLine();
	  if(s.equals("Y") || s.equals("y"))
	  {
		Connection conn = null;
		Statement stmt = null;
   
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      //STEP 4: Execute a query
      System.out.println("Creating Hotel Database...");
      stmt = conn.createStatement();
      
      String sql = "CREATE DATABASE Hotel";
       stmt.executeUpdate(sql);
      System.out.println("DataBase created successfully...");
	  System.out.println("NowCreating Login Table \n");
	  Thread.sleep(500);
	  
	  DB_URL = "jdbc:mysql://localhost/Hotel";
	 conn = DriverManager.getConnection(DB_URL,USER,PASS);
	 stmt = conn.createStatement();
	 String log = "CREATE TABLE login(UserId varchar(10),Password varchar(10),Date varchar(15),PRIMARY KEY(UserId))";
      stmt.executeUpdate(log);
	  System.out.println("SuccesFully Login Table Created\n");
	  // Now Creat Customer Table into DAtabase Hotel
	  Thread.sleep(1000);
	 DB_URL = "jdbc:mysql://localhost:3306/Hotel";
	 conn = DriverManager.getConnection(DB_URL,USER,PASS);
	 stmt = conn.createStatement();
	 String cust = "CREATE TABLE customer(Room_No varchar(3),Name varchar(25) ,Mobile varchar(12),Address varchar(30),Gender varchar(10),Booking_Date varchar(15),Food varchar(10),Room varchar(10),Exit_Date varchar(15),Bill int(10),DownPayment int(10),Payable int(10), PRIMARY KEY(Room_No))";
      stmt.executeUpdate(cust);
	  System.out.println("SuccesFully Customer Table Created");
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
   System.out.println("Connection Stablist \n \t Attention Please :\n1. First Submit a customer detail into application then try to See Record:");
   System.out.println("Thanks for Using : Jkewara Hotel ");
	  }
	  else{
		  System.out.println("First go And Start Your Sql Server or MySql server : App Management");
	  }
}//end main
}//end JDBCExample