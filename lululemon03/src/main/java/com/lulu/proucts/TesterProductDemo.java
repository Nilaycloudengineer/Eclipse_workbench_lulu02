package com.lulu.proucts;
import java.util.ArrayList;
public class TesterProductDemo {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        
        // Creating instances of Product and adding to the collection
        Product p1 = new Product("Mango", 100.0, "10% off");
        Product p2 = new Product("Banana", 150.0, "20% off");
        Product p3 = new Product("Milk", 200.0, "15% off");
        Product p4 = new Product("Litchi", 120.0, "25% off");
        Product p5 = new Product("Apple", 180.0, "30% off");

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        // Displaying all the records
        for (Product product : products) {
            System.out.println(product);
        }
    }
}






