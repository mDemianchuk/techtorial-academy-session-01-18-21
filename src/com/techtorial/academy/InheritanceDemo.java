package com.techtorial.academy;

public class InheritanceDemo {
    public static void main(String[] args) {
        Vehicle car = new Car(100, 4);
        Vehicle bike = new Bicycle(10, 2);

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

    public Car(int speed, int numberOfWheels) {
        super(speed, numberOfWheels);
    }
}

class Bicycle extends Vehicle {

    public Bicycle(int speed, int numberOfWheels) {
        super(speed, numberOfWheels);
    }
}