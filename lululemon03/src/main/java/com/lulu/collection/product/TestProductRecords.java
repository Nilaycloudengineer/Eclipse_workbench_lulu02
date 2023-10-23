package com.lulu.collection.product;
import java.util.ArrayList;
public class TestProductRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create instances of Product
        Product p1 = new Product("Apple", 100.0, "10% off");
        Product p2 = new Product("Banana", 150.0, "15% off");
        Product p3 = new Product("Mango", 200.0, "20% off");
        Product p4 = new Product("Litchi", 250.0, "25% off");
        Product p5 = new Product("Ice-cream", 300.0, "30% off");

        // Create a collection to hold the products
        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        // Display all the records
        for (Product product : products) {
            System.out.println(product);
        }
    }

	}











