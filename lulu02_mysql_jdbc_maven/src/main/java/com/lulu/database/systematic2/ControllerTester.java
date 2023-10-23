package com.lulu.database.systematic2;

import java.sql.SQLException;

import com.lulu.database.systematic2.BusinessLogic;

public class ControllerTester {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		BusinessLogic bl = new BusinessLogic();
		bl.createData();
		bl.readData();
		// bl.deletData();
		// bl.updateData();

	}

}
