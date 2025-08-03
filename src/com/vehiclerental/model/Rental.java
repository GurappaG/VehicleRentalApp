package com.vehiclerental.model;

import java.time.LocalDate;

public class Rental {
    private final Vehicle vehicle;
    private final Customer customer;
    private final LocalDate rentDate;

    public Rental(Vehicle vehicle, Customer customer) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentDate = LocalDate.now();
    }

    public double returnVehicle() {
        int days = (int) (LocalDate.now().toEpochDay() - rentDate.toEpochDay());
        return days * vehicle.getRatePerDay();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }
}

