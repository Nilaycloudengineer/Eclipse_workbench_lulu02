package com.lulu.assignment;

import java.util.ArrayList;

class School {
    String name;
    int id;
    String address;

    School(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return "School Name: " + name + ", School ID: " + id + ", School Address: " + address;
    }
}