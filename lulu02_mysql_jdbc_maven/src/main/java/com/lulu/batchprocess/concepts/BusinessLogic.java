package com.lulu.batchprocess.concepts;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusinessLogic {

    // ... existing methods ...

    void batchProcess() throws SQLException {
        Connection connection = ConnectDB.setupConnection();

        // Use a PreparedStatement for batch processing
        String query = "INSERT INTO employee (id, name, dept) VALUES (?, ?, ?)";
        PreparedStatement myStmt = connection.prepareStatement(query);

        // Sample data for batch insertion
        int[] ids = {777, 888, 999};
        String[] names = {"John", "Doe", "Alice"};
        String[] depts = {"IT", "HR", "Finance"};

        for (int i = 0; i < ids.length; i++) {
            myStmt.setInt(1, ids[i]);
            myStmt.setString(2, names[i]);
            myStmt.setString(3, depts[i]);
            myStmt.addBatch();
        }

        int[] success = myStmt.executeBatch();
        System.out.println("Batch process successful for " + success.length + " records.");
    }
}
