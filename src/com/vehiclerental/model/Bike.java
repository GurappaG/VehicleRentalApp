package com.vehiclerental.model;

public class Bike extends Vehicle {
    public Bike(String plate, String brand, double rate) {
        super(plate, brand, rate);
    }

    @Override
    public String getType() {
        return "Bike";
    }
}
