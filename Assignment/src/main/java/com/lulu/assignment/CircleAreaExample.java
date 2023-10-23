package com.lulu.assignment;

@FunctionalInterface
interface Area {
    double circleArea(double radius);
}

public class CircleAreaExample {

    public static void main(String[] args) {
        // Using a lambda expression to calculate the area of a circle
        Area areaCalculator = (radius) -> Math.PI * radius * radius;

        // Radius of the circle
        double radius = 5.0;

        // Calculate the area of the circle using the lambda expression
        double area = areaCalculator.circleArea(radius);

        // Print the calculated area
        System.out.println("Area of the circle: " + area);
    }
}
