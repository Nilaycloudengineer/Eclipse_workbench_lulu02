package com.lulu.assignment;

import java.util.List;

public class HR_Manager {
    public void processRecords(List<Employee> employees) {
        System.out.println("Employee Records:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
