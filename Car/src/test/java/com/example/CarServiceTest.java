package com.example;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarServiceTest {
        
        private CarService carService;
        
        @BeforeEach
        public void setUp() {
            carService = new CarService();
        }
        
        @Test
        public void test_add_car() {
            Car car = new Car();
            car.setId(1);
            car.setMake("Toyota");
            car.setModel("Camry");
            car.setYear(2022);
            car.setPrice(25000.0);
            car.setColor("Red");
            car.setMileage(10000);
            car.setVIN("1234567890");
            car.setOwner("John Doe");
            
            carService.add_car(car);
            
            Assertions.assertEquals(1, carService.list_cars().size());
        }
        
        @Test
        public void test_update_car() {
            Car car1 = new Car();
            car1.setId(1);
            car1.setMake("Toyota");
            car1.setModel("Camry");
            car1.setYear(2022);
            car1.setPrice(25000.0);
            car1.setColor("Red");
            car1.setMileage(10000);
            car1.setVIN("1234567890");
            car1.setOwner("John Doe");
            
            carService.add_car(car1);
            
            Car car2 = new Car();
            car2.setId(2);
            car2.setMake("Honda");
            car2.setModel("Accord");
            car2.setYear(2023);
            car2.setPrice(27000.0);
            car2.setColor("Blue");
            car2.setMileage(5000);
            car2.setVIN("0987654321");
            car2.setOwner("Jane Doe");
            
            carService.update_car(0, car2);
            
            Assertions.assertEquals("Honda", carService.list_cars().get(0).getMake());
        }
        
        @Test
        public void test_delete_car() {
            Car car = new Car();
            car.setId(1);
            car.setMake("Toyota");
            car.setModel("Camry");
            car.setYear(2022);
            car.setPrice(25000.0);
            car.setColor("Red");
            car.setMileage(10000);
            car.setVIN("1234567890");
            car.setOwner("John Doe");
            
            carService.add_car(car);
            carService.delete_car(0);
            
            Assertions.assertEquals(0, carService.list_cars().size());
        }
        
        @Test
        public void test_list_cars() {
            Car car1 = new Car();
            car1.setId(1);
            car1.setMake("Toyota");
            car1.setModel("Camry");
            car1.setYear(2022);
            car1.setPrice(25000.0);
            car1.setColor("Red");
            car1.setMileage(10000);
            car1.setVIN("1234567890");
            car1.setOwner("John Doe");
            
            Car car2 = new Car();
            car2.setId(2);
            car2.setMake("Honda");
            car2.setModel("Accord");
            car2.setYear(2023);
            car2.setPrice(27000.0);
            car2.setColor("Blue");
            car2.setMileage(5000);
            car2.setVIN("0987654321");
            car2.setOwner("Jane Doe");
            
            carService.add_car(car1);
            carService.add_car(car2);
            
            List<Car> cars = carService.list_cars();
            
            Assertions.assertEquals(2, cars.size());
        }
        
        @Test
        public void test_search_car_by_model() {
            Car car1 = new Car();
            car1.setId(1);
            car1.setMake("Toyota");
            car1.setModel("Camry");
            car1.setYear(2022);
            car1.setPrice(25000.0);
            car1.setColor("Red");
            car1.setMileage(10000);
            car1.setVIN("1234567890");
            car1.setOwner("John Doe");
            
            Car car2 = new Car();
            car2.setId(2);
            car2.setMake("Honda");
            car2.setModel("Accord");
            car2.setYear(2023);
            car2.setPrice(27000.0);
            car2.setColor("Blue");
            car2.setMileage(5000);
            car2.setVIN("0987654321");
            car2.setOwner("Jane Doe");
            
            carService.add_car(car1);
            carService.add_car(car2);
            
            List<Car> result = carService.search_car_by_model("Camry");
            
            Assertions.assertEquals(1, result.size());
            Assertions.assertEquals("Camry", result.get(0).getModel());
        }
    }
    // Add more test cases for other methods
    
