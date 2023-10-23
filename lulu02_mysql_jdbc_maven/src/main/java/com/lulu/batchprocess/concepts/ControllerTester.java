package com.lulu.batchprocess.concepts;


import java.sql.SQLException;

public class ControllerTester {

    public static void main(String[] args) throws SQLException {
        BusinessLogic bl = new BusinessLogic();
     //   bl.createData();
     //   bl.readData();
     //   bl.deletData();
     //   bl.updateData();
        bl.batchProcess(); // Adding batch processing
    }
}
