package com.lulu.collection.product;

import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private String discountOffer;

    public Product(String name, double price, String discountOffer) {
        this.name = name;
        this.price = price;
        this.discountOffer = discountOffer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discountOffer='" + discountOffer + '\'' +
                '}';
    }
}