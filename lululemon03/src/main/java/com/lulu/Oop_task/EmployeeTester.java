package com.lulu.Oop_task;
public class EmployeeTester {
    public static void main(String[] args) {
        // Creating an Employee
        Employee employee = new Employee("John Doe", "IT", 50000);
        employee.displayInfo();

        // Creating a Department and adding employees
        Department department = new Department("IT Department", "IT", 60000, 3);
        department.addEmployee("Alice");
        department.addEmployee("Bob");
        department.addEmployee("Charlie");
        department.displayInfo();
        department.displayEmployees();
    }
}