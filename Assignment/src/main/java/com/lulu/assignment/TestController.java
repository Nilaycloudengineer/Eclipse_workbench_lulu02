package com.lulu.assignment;

import java.util.ArrayList;
import java.util.List;

public class TestController {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Static initialization of employee records
        employees.add(new Employee("Keertana Pandit", 30, "Manager"));
        employees.add(new Employee("Nilay Mishra", 25, "Software Engineer"));
        employees.add(new Employee("Sahana S", 35, "Senior Developer"));
        employees.add(new Employee("Apoorva", 28, "Designer"));
        employees.add(new Employee("Pranjala", 40, "Director"));

        HR_Manager hrManager = new HR_Manager();
        hrManager.processRecords(employees);
    }
}
