package com.lulu.oop_poly;

public class Employee {
    private String name;
    private String department;
    private double salary;

    public void add(String n, String d, double s) {
        name = n;
        department = d;
        salary = s;
    }

    public void showData() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}