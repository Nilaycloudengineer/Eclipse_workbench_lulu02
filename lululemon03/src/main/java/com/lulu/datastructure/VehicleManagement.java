package com.lulu.datastructure;
import java.util.LinkedList;
public class VehicleManagement {
    public static void main(String[] args) {
        LinkedList<Vehicle> vehicleList = new LinkedList<>();

        // Add 4 vehicle objects
        vehicleList.add(new Vehicle("E12345", "Car", "X123"));
        vehicleList.add(new Vehicle("E67890", "Motorcycle", "Y456"));
        vehicleList.add(new Vehicle("E54321", "Truck", "Z789"));
        vehicleList.add(new Vehicle("E98765", "SUV", "A234"));

        // Display records
        System.out.println("Vehicle Records:");
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
        }
    }
}