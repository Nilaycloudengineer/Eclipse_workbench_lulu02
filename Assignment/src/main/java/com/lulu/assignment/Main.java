package com.lulu.assignment;

public class Main {
    public static void main(String[] args) {
        SchoolRecords records = new SchoolRecords();

        // Adding school records
        records.addRecord("Blue Bells School", 1009768756, "Rajaji Salai Street, Chennai");
        records.addRecord("Holy Cross School", 1243454655, "Vellala Street, Chennai");
        records.addRecord("Christ School", 1576433689, "Mint Street, Chennai");

        // Displaying school records
        records.displayRecords();
    }
}