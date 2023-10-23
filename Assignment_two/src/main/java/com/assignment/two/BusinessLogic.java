package com.assignment.two;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusinessLogic {

	// CRUD Operations

	public void createData() throws SQLException {
		Connection connection = ConnectDB.setupConnection();
		String query = "INSERT INTO FashionRetailers (Id, Name, Age, City, Phone_Number) VALUES( ?, ?,?,?,?)";

		PreparedStatement myStmt = connection.prepareStatement(query);
		myStmt.setInt(1, 104);
		myStmt.setString(2, "Amit");
		myStmt.setInt(3, 30);
		myStmt.setString(4, "Mumbai");
		myStmt.setInt(5, 33333333);

		int success = myStmt.executeUpdate();
		System.out.println("Added Successfully " + success);

	}

	public void readData() throws SQLException {
		Connection connection = ConnectDB.setupConnection();

		Statement statement;
		statement = connection.createStatement();
		ResultSet resultSet;
		resultSet = statement.executeQuery("select * from FashionRetailers where id>=111");
		int Id;
		String Name;
		int Age;
		String City;
		int Phone_Number;
		while (resultSet.next()) {
			Id = resultSet.getInt("Id");
			Name = resultSet.getString("Name");
			Age = resultSet.getInt("Age");
			City = resultSet.getString("City");
			Phone_Number = resultSet.getInt("Phone_Number");
			System.out.println("Id : " + Id + " Name : " + Name + "  Age:" + Age + "City:" + City + "Phone_Number:"
					+ Phone_Number);
		}

	}

	void updateData() throws SQLException {

		Connection connection = ConnectDB.setupConnection();
		String query = "update FashionRetailers set name= ? where id = ? ";
		PreparedStatement myStmt = connection.prepareStatement(query);
		myStmt.setString(1, "Ajit");
		myStmt.setInt(2, 102);
		boolean success = myStmt.execute();
		System.out.println("Deleted Successfully " + success);

	}

	void deleteData() throws SQLException {
		Connection connection = ConnectDB.setupConnection();
		String query = "delete from FashionRetailers where id = ? ";
		PreparedStatement myStmt = connection.prepareStatement(query);
		myStmt.setInt(1, 101);
		boolean success = myStmt.execute();
		System.out.println("Deleted Successfully " + success);

	}

}
