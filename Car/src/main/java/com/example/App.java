package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarService carService = new CarService();

        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Add a car");
            System.out.println("2. Update a car");
            System.out.println("3. Delete a car");
            System.out.println("4. List all cars");
            System.out.println("5. Search for a car");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            try {
                switch (choice) {
                    case 1:
                        // Add a car
                        System.out.print("Enter car details:\n");
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        System.out.print("Make: ");
                        String make = scanner.nextLine();
                        System.out.print("Model: ");
                        String model = scanner.nextLine();
                        System.out.print("Year: ");
                        int year = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        System.out.print("Price: ");
                        double price = scanner.nextDouble();
                        scanner.nextLine(); // Consume the newline character
                        System.out.print("Color: ");
                        String color = scanner.nextLine();
                        System.out.print("Mileage: ");
                        double mileage = scanner.nextDouble();
                        scanner.nextLine(); // Consume the newline character
                        System.out.print("VIN: ");
                        String vin = scanner.nextLine();
                        System.out.print("Owner: ");
                        String owner = scanner.nextLine();

                        Car car = new Car(id, make, model, year, price, color, mileage, vin, owner);
                        carService.addCar(car);
                        System.out.println("Car added successfully!");
                        break;
                    case 2:
                        // Update a car
                        System.out.print("Enter the ID of the car to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        Car updateCar = carService.getCarById(updateId);
                        if (updateCar == null) {
                            System.out.println("Car not found!");
                        } else {
                            System.out.print("Enter updated car details:\n");
                            System.out.print("Make: ");
                            String updatedMake = scanner.nextLine();
                            System.out.print("Model: ");
                            String updatedModel = scanner.nextLine();
                            System.out.print("Year: ");
                            int updatedYear = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline character
                            System.out.print("Price: ");
                            double updatedPrice = scanner.nextDouble();
                            scanner.nextLine(); // Consume the newline character
                            System.out.print("Color: ");
                            String updatedColor = scanner.nextLine();
                            System.out.print("Mileage: ");
                            double updatedMileage = scanner.nextDouble();
                            scanner.nextLine(); // Consume the newline character
                            System.out.print("VIN: ");
                            String updatedVin = scanner.nextLine();
                            System.out.print("Owner: ");
                            String updatedOwner = scanner.nextLine();

                            updateCar.setMake(updatedMake);
                            updateCar.setModel(updatedModel);
                            updateCar.setYear(updatedYear);
                            updateCar.setPrice(updatedPrice);
                            updateCar.setColor(updatedColor);
                            updateCar.setMileage(updatedMileage);
                            updateCar.setVin(updatedVin);
                            updateCar.setOwner(updatedOwner);

                            carService.updateCar(updateCar);
                            System.out.println("Car updated successfully!");
                        }
                        break;
                    case 3:
                        // Delete a car
                        System.out.print("Enter the ID of the car to delete: ");
                        int deleteId = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        Car deleteCar = carService.getCarById(deleteId);
                        if (deleteCar == null) {
                            System.out.println("Car not found!");
                        } else {
                            carService.deleteCar(deleteCar);
                            System.out.println("Car deleted successfully!");
                        }
                        break;
                    case 4:
                        // List all cars
                        System.out.println("List of cars:");
                        for (Car c : carService.getAllCars()) {
                            System.out.println(c);
                        }
                        break;
                    case 5:
                        // Search for a car
                        System.out.print("Enter the ID of the car to search: ");
                        int searchId = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        Car searchCar = carService.getCarById(searchId);
                        if (searchCar == null) {
                            System.out.println("Car not found!");
                        } else {
                            System.out.println("Car details:");
                            System.out.println(searchCar);
                        }
                        break;
                    case 6:
                        // Exit
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}