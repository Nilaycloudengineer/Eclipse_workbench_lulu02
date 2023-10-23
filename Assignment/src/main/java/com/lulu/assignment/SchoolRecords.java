package com.lulu.assignment;
import java.util.ArrayList;
class SchoolRecords {
    private ArrayList<School> schools;

    SchoolRecords() {
        schools = new ArrayList<>();
    }

    void addRecord(String name, int id, String address) {
        School school = new School(name, id, address);
        schools.add(school);
    }

    void displayRecords() {
        for (School school : schools) {
            System.out.println(school);
        }
    }
}