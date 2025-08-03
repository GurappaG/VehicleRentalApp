
package com.vehiclerental.service;

import com.vehiclerental.model.*;

import java.util.ArrayList;
import java.util.List;

public class VehicleService {
    private final List<Vehicle> vehicles = new ArrayList<>();

    public VehicleService() {
        vehicles.add(new Car("TN12AB1234", "BMW", 800));
        vehicles.add(new Bike("TN12XY5678", "Royal Enfield", 300));
    }

    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> available = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) available.add(v);
        }
        return available;
    }

    public void displayVehicles() {
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }

    public Vehicle getVehicleByPlate(String plate) {
        for (Vehicle v : vehicles) {
            if (v.getPlateNumber().equalsIgnoreCase(plate)) return v;
        }
        return null;
    }
}

