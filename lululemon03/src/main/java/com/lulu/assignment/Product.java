package com.lulu.assignment;

class Product extends Industry {
    @Override
    public void process() {
        System.out.println("Processing in the Product class:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0)  // Print a new line every 10 numbers
                System.out.println();
        }
    }
}