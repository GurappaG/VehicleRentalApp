package com.vehiclerental.model;

public abstract class Vehicle {
    protected String plateNumber;
    protected String brand;
    protected double ratePerDay;
    protected boolean isAvailable = true;

    public Vehicle(String plateNumber, String brand, double ratePerDay) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.ratePerDay = ratePerDay;
    }

    public abstract String getType();

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public double getRatePerDay() {
        return ratePerDay;
    }

    public void displayInfo() {
        System.out.printf("%s - %s (%s): ₹%.2f/day - %s\n", plateNumber, brand, getType(), ratePerDay, isAvailable ? "Available" : "Rented");
    }
}

