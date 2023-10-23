package com.lulu.collections.employee;

import java.util.ArrayList;
public class TeaterController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///bucket for storing employee Objects -- Arraylist
		ArrayList<Employee> bucketEmployee = new ArrayList<Employee>();
		System.out.println(bucketEmployee.size());
		Employee e1= new Employee("amit", "SW", 34);
		Employee e2= new Employee("Nilay", "SW", 24);
		bucketEmployee.add(e1);
		bucketEmployee.add(e2);

		bucketEmployee.add(new Employee("Nagasree", "Sw",23));
		bucketEmployee.add(new Employee("Nanditha", "Sw",25));



		System.out.println(bucketEmployee.size());
		System.out.println("Records in the collection is ");
		System.out.println(bucketEmployee);
		System.out.println("////////*************///////////");
		for(Employee e : bucketEmployee) {
			System.out.println(e);
		}





 

	}

 

}