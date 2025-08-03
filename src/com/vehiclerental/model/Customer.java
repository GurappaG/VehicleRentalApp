
package com.vehiclerental.model;

public class Customer {
    private final String name;
    private final String licenseId;

    public Customer(String name, String licenseId) {
        this.name = name;
        this.licenseId = licenseId;
    }

    public String getName() {
        return name;
    }

    public String getLicenseId() {
        return licenseId;
    }
}
