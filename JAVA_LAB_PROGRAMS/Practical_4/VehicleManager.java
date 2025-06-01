package Practical_4;

import java.util.Scanner;


class Vehicle {           // Base class
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}


class Car extends Vehicle {          // Derived class: Car
    private int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Car Doors: " + doors);
        System.out.println("Type: Car");
    }
}


class Bike extends Vehicle {   // Derived class: Bike
    private boolean hasGear;

    public Bike(String brand, int speed, boolean hasGear) {
        super(brand, speed);
        this.hasGear = hasGear;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
        System.out.println("Type: Bike");
    }
}


class Truck extends Vehicle {        // Derived class: Truck
    private int capacity;

    public Truck(String brand, int speed, int capacity) {
        super(brand, speed);
        this.capacity = capacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo Capacity: " + capacity + " tons");
        System.out.println("Type: Truck");
    }
}


public class VehicleManager {  // Main Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter vehicle type (Car/Bike/Truck): ");
        String type = scanner.nextLine().trim();

        System.out.print("Enter brand name: ");
        String brand = scanner.nextLine();

        System.out.print("Enter speed (km/h): ");
        int speed = scanner.nextInt();

        Vehicle vehicle = null;

        switch (type.toLowerCase()) {
            case "car":
                System.out.print("Enter number of doors: ");
                int doors = scanner.nextInt();
                vehicle = new Car(brand, speed, doors);
                break;
            case "bike":
                System.out.print("Does it have gear? (true/false): ");
                boolean hasGear = scanner.nextBoolean();
                vehicle = new Bike(brand, speed, hasGear);
                break;
            case "truck":
                System.out.print("Enter cargo capacity (tons): ");
                int capacity = scanner.nextInt();
                vehicle = new Truck(brand, speed, capacity);
                break;
            default:
                System.out.print("Invalid vehicle type!");
                break;
        }

        System.out.println("\n=== Vehicle Info ===");
        vehicle.displayInfo();

        scanner.close();
    }
}