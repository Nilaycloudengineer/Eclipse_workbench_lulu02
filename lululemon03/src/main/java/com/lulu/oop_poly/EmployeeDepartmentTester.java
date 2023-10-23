package com.lulu.oop_poly;

public class EmployeeDepartmentTester {
    public static void main(String[] args) {
        Department departmentEmployee = new Department();
        // Adding employee data
        departmentEmployee.add("Nilay", "Associate", 165000.0);

        // Displaying employee data
        departmentEmployee.showData();

        // Displaying department record
        departmentEmployee.displayRecord();
    }
}