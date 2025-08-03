# VehicleRentalApp(code is pushed to master branch if required check that)

# 🚗 Vehicle Rental App - Java Console Application

[![Java](https://img.shields.io/badge/built%20with-Java-orange)](https://www.java.com)
[![OOP](https://img.shields.io/badge/OOP-Principles-blue)]()
[![Platform](https://img.shields.io/badge/platform-Console-lightgrey)]()
[![MIT License](https://img.shields.io/badge/license-MIT-green.svg)](LICENSE)

A simple, modular **console-based Vehicle Rental System** built in Java. The application simulates a real-world vehicle rental service with support for **customer registration, vehicle listing, rentals, returns, and billing**. Ideal for learning Java OOPs and for showcasing as a project in resumes or GitHub portfolios.

---

## ✨ Features

- 🔍 View available cars and bikes
- 👤 Register customers with license ID
- 🧾 Rent vehicles and calculate cost based on days
- 🔁 Return rented vehicles with billing
- ✅ Built using clean OOP principles (inheritance, encapsulation, abstraction)
- 📁 Follows clean package structure for modularity

---

## 📂 Project Structure

VehicleRentalApp/
├── src/
│ └── com.vehiclerental/
│ ├── Main.java
│ ├── model/
│ │ ├── Vehicle.java, Car.java, Bike.java, Customer.java, Rental.java
│ ├── service/
│ │ ├── VehicleService.java, CustomerService.java, RentalService.java
│ └── util/
│ └── InputHelper.java
├── README.md
└── LICENSE


---

## 🚀 Getting Started

### Prerequisites

- Java 8 or higher
- Eclipse IDE or any Java editor

### Run from Eclipse

1. Clone or download the project:
   ```bash
   git clone https://github.com/GurappaG/VehicleRentalApp.git
   Console view
--- VEHICLE RENTAL SYSTEM ---
1. List Vehicles
2. Register Customer
3. Rent Vehicle
4. Return Vehicle
5. Exit

  Concepts Used
Java OOP: Classes, Abstraction, Inheritance, Encapsulation

Scanner-based console input

HashMap and ArrayList data structures

Modular design with packages

Java LocalDate API for rental period calculation
