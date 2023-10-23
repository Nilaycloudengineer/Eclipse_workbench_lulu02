package com.lulu.Oop_task;

class Department extends Employee {
    private String[] employeeList;
    private int employeeCount;

    public Department(String name, String department, double salary, int maxEmployees) {
        super(name, department, salary);
        employeeList = new String[maxEmployees];
        employeeCount = 0;
    }

    public void addEmployee(String employeeName) {
        if (employeeCount < employeeList.length) {
            employeeList[employeeCount] = employeeName;
            employeeCount++;
        } else {
            System.out.println("Employee limit reached for this department.");
        }
    }

    public void displayEmployees() {
        System.out.println("Employees in " + department + " department:");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println(employeeList[i]);
        }
    }
}
