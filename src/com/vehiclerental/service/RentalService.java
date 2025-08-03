package com.vehiclerental.service;

import com.vehiclerental.model.*;
import com.vehiclerental.util.InputHelper;

import java.util.HashMap;
import java.util.Map;

public class RentalService {
    private final VehicleService vehicleService;
    private final Map<String, Rental> activeRentals = new HashMap<>();

    public RentalService(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public void rentVehicle(CustomerService customerService) {
        vehicleService.displayVehicles();
        String plate = InputHelper.readLine("Enter Vehicle Plate to Rent: ");
        Vehicle vehicle = vehicleService.getVehicleByPlate(plate);

        if (vehicle == null || !vehicle.isAvailable()) {
            System.out.println("Vehicle not available.");
            return;
        }

        String license = InputHelper.readLine("Enter Customer License ID: ");
        Customer customer = customerService.getCustomerByLicense(license);
        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        vehicle.setAvailable(false);
        Rental rental = new Rental(vehicle, customer);
        activeRentals.put(plate, rental);
        System.out.println("Rental Successful!");
    }

    public void returnVehicle() {
        String plate = InputHelper.readLine("Enter Vehicle Plate to Return: ");
        Rental rental = activeRentals.get(plate);
        if (rental == null) {
            System.out.println("Rental not found.");
            return;
        }

        double amount = rental.returnVehicle();
        rental.getVehicle().setAvailable(true);
        activeRentals.remove(plate);
        System.out.printf("Vehicle Returned. Total Due: ₹%.2f\n", amount);
    }
}

