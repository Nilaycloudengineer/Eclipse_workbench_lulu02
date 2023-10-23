package com.lulu.comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Tester {

	 public static void main(String[] args) {
	        BusinessLogic bl = new  BusinessLogic();

	        // Adding 5 employee objects to the collection
	        bl.addEmployee(new EmployeeEntity(1, "Sahana", 30, 50000, "Manager"));
	        bl.addEmployee(new EmployeeEntity(2, "Zulfa", 25, 40000, "Assistant"));
	        bl.addEmployee(new EmployeeEntity(3, "Monika", 35, 60000, "Senior Manager"));
	        bl.addEmployee(new EmployeeEntity(4, "Ajit", 28, 45000, "Associate"));
	        bl.addEmployee(new EmployeeEntity(5, "Amit", 32, 55000, "Manager"));

	        // Display all records
	        System.out.println("All records:");
	        bl.displayAllRecords();

	        // Sorting by name and displaying records
	        System.out.println("\nSorted by name:");
	        bl.sortAndDisplay(Comparator.comparing(EmployeeEntity::getName));

	        // Sorting by age and displaying records
	        System.out.println("\nSorted by age:");
	        bl.sortAndDisplay(Comparator.comparingInt(EmployeeEntity::getAge));
	    }
	

}
