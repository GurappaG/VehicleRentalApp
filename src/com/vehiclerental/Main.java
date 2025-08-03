package com.vehiclerental;

import com.vehiclerental.service.*;
import com.vehiclerental.model.*;
import com.vehiclerental.util.InputHelper;

public class Main {
    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleService();
        CustomerService customerService = new CustomerService();
        RentalService rentalService = new RentalService(vehicleService);

        while (true) {
            System.out.println("\n--- VEHICLE RENTAL SYSTEM ---");
            System.out.println("1. List Vehicles");
            System.out.println("2. Register Customer");
            System.out.println("3. Rent Vehicle");
            System.out.println("4. Return Vehicle");
            System.out.println("5. Exit");

            int choice = InputHelper.readInt("Enter choice: ");

            switch (choice) {
                case 1 -> vehicleService.displayVehicles();
                case 2 -> customerService.registerCustomer();
                case 3 -> rentalService.rentVehicle(customerService);
                case 4 -> rentalService.returnVehicle();
                case 5 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
