package com.lulu.comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class BusinessLogic {
    private ArrayList<EmployeeEntity> employees;

    public BusinessLogic() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(EmployeeEntity employee) {
        employees.add(employee);
    }

    public void displayAllRecords() {
        for (EmployeeEntity employee : employees) {
            System.out.println(employee);
        }
    }

    public void sortAndDisplay(Comparator<EmployeeEntity> comparator) {
        Collections.sort(employees, comparator);
        displayAllRecords();
    }
}
