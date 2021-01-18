package com.techtorial.academy;

public class InheritanceDemo {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2020, 100, 4);
        Vehicle bike = new Bicycle("mountain", 10, 2);

        System.out.println(car);
        System.out.println(bike);
    }
}

class Vehicle {
    private int speed;
    private int numberOfWheels;

    public Vehicle(int speed, int numberOfWheels) {
        this.speed = speed;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("The speed of this vehicle is ")
                .append(this.speed)
                .append(" and it has ")
                .append(this.numberOfWheels)
                .append(" wheels!")
                .toString();
    }
}

class Car extends Vehicle {

    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year, int speed, int numberOfWheels) {
        super(speed, numberOfWheels);
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(super.toString())
                .append(" And it's a ")
                .append(this.year)
                .append(" ")
                .append(this.make)
                .append(" ")
                .append(this.model)
                .toString();
    }
}

class Bicycle extends Vehicle {

    private String kind;

    public Bicycle(String kind, int speed, int numberOfWheels) {
        super(speed, numberOfWheels);
        this.kind = kind;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(super.toString())
                .append(" And it's a ")
                .append(this.kind)
                .append(" bike")
                .toString();
    }
}