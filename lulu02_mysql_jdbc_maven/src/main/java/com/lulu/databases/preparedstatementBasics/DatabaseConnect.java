package com.lulu.databases.preparedstatementBasics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

 

public class DatabaseConnect {

 

 

		public static void main(String[] args) {

			try {
			 Class.forName("com.mysql.cj.jdbc.Driver");//drive support sets up

	         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lulu02",
	             "root", "admin");

	         //Instert Operation ALso Prepared Statement "

	         String query
	            = "Select * from employee where id > ? ";

	        // Prepare Statement
	        PreparedStatement myStmt = connection.prepareStatement(query);

 

 

	 // Set Parameters
	        myStmt.setInt(1, 222); // ready with Prepared Statement 
	       // myStmt.setString(2, 'Prateek');

	        // Execute SQL query
	        ResultSet resultSet = myStmt.executeQuery();

	        int id;
	         String name;
	         String dept;
	         while (resultSet.next()) {
	             id = resultSet.getInt("id");
	             name = resultSet.getString("name");
	             dept=resultSet.getString("dept");
	             System.out.println("id : " + id
	                                + " name : " + name +"  departmet:"+ dept);
	         }

 

	         









			}catch(Exception E) {

			}

 

			






 

		}

 

		


 

	}

 