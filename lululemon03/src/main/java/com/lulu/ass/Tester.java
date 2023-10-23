package com.lulu.ass;
public class Tester {
    public static void main(String[] args) {
        GermanShepherd gs = new GermanShepherd();
        gs.sound();   // Accessing method from Animal class
        gs.bark();    // Accessing method from Dog class
        gs.guard();   // Accessing method from GermanShepherd class
    }
}