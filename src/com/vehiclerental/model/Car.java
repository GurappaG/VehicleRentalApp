package com.vehiclerental.model;

public class Car extends Vehicle {
    public Car(String plate, String brand, double rate) {
        super(plate, brand, rate);
    }

    @Override
    public String getType() {
        return "Car";
    }
}

