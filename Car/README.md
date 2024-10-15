# Car Console Application

This is a Java console application for managing car records. It provides options to add, update, delete, list, search, and exit car records.

## Project Structure

```
Car
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── App.java
│   │   │           ├── Car.java
│   │   │           └── CarService.java
│   │   └── resources
│   └── test
│       ├── java
│       │   └── com
│       │       └── example
│       │           └── CarServiceTest.java
│       └── resources
├── pom.xml
└── README.md
```

The project has the following files:

- `src/main/java/com/example/App.java`: This file contains the main class `App` which serves as the entry point of the application. It contains the menu options for adding, updating, deleting, listing, searching, and exiting the car records. It handles user inputs and exception handling.

- `src/main/java/com/example/Car.java`: This file contains the `Car` class which represents a car object. It has properties such as id, make, model, year, price, color, mileage, VIN, and owner. It provides getters and setters for these properties.

- `src/main/java/com/example/CarService.java`: This file contains the `CarService` class which provides the logic for performing operations on car objects. It includes methods for adding, updating, deleting, listing, and searching car records.

- `src/test/java/com/example/CarServiceTest.java`: This file contains the unit tests for the `CarService` class. It includes test cases to verify the functionality of the methods in the `CarService` class.

- `pom.xml`: This file is the Maven configuration file. It includes the dependencies for JUnit 5 and any other required dependencies for the project.

## How to Run

To run the application, execute the `App` class in your IDE or run the following command in the project root directory:

```
mvn exec:java -Dexec.mainClass="com.example.App"
```

## How to Test

To run the unit tests, execute the following command in the project root directory:

```
mvn test
```

```

This file is intentionally left blank.
```