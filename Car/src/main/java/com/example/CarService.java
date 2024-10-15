package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    // List to store car records
    private List<Car> car_list = new ArrayList<>();

    // Method to add a car
    public void add_car(Car car) {
        car_list.add(car);
    }

    // Method to update a car
    public void update_car(int index, Car car) {
        if (index >= 0 && index < car_list.size()) {
            car_list.set(index, car);
        }
    }

    // Method to delete a car
    public void delete_car(int index) {
        if (index >= 0 && index < car_list.size()) {
            car_list.remove(index);
        }
    }

    // Method to list all cars
    public List<Car> list_cars() {
        return new ArrayList<>(car_list);
    }

    // Method to search for a car by model
    public List<Car> search_car_by_model(String model) {
        return car_list.stream()
                       .filter(car -> car.getModel().equalsIgnoreCase(model))
                       .collect(Collectors.toList());
    }
    // Implement methods for adding, updating, deleting, listing, and searching car records
    // You can use the Car class to represent car objects and perform operations on them
}