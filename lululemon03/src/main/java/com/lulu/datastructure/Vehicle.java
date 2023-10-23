package com.lulu.datastructure;
class Vehicle {
    private String engineCode;
    private String name;
    private String modelNo;

    public Vehicle(String engineCode, String name, String modelNo) {
        this.engineCode = engineCode;
        this.name = name;
        this.modelNo = modelNo;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engineCode='" + engineCode + '\'' +
                ", name='" + name + '\'' +
                ", modelNo='" + modelNo + '\'' +
                '}';
    }
}