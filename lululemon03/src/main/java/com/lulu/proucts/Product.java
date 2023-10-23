package com.lulu.proucts;


class Product {
    private String name;
    private double price;
    private String discountOffer;

    // Constructors
    public Product() {
    }

    public Product(String name, double price, String discountOffer) {
        this.name = name;
        this.price = price;
        this.discountOffer = discountOffer;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDiscountOffer() {
        return discountOffer;
    }

    public void setDiscountOffer(String discountOffer) {
        this.discountOffer = discountOffer;
    }

    // toString method for string representation
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discountOffer='" + discountOffer + '\'' +
                '}';
    }

    // hashCode and equals methods for object comparison
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Product product = (Product) obj;
        return name.equals(product.name);
    }
}