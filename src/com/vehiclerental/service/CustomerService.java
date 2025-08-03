package com.vehiclerental.service;

import com.vehiclerental.model.Customer;
import com.vehiclerental.util.InputHelper;

import java.util.HashMap;
import java.util.Map;

public class CustomerService {
    private final Map<String, Customer> customers = new HashMap<>();

    public void registerCustomer() {
        String name = InputHelper.readLine("Enter Name: ");
        String license = InputHelper.readLine("Enter License ID: ");
        customers.put(license, new Customer(name, license));
        System.out.println("Customer registered successfully!");
    }

    public Customer getCustomerByLicense(String licenseId) {
        return customers.get(licenseId);
    }
}
