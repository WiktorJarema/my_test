package ConstructorTests;

public class SportsCar2 extends Car {

    boolean spoiler;
    int power;
    int torque;
    int gears;

    public SportsCar2(String name, String color, int numberOfDoors, int power, int torque, int gears) {
        this(name, color, numberOfDoors);
        this.power = power;
        this.torque = torque;
        this.gears = gears;
    }

    public SportsCar2(String name, String color, int numberOfDoors, int power, int torque) {
        this(name, color, numberOfDoors);
        this.power = power;
        this.torque = torque;
    }

    public SportsCar2(String name, String color, int numberOfDoors, int gears) {
        this(name, color, numberOfDoors);
        this.gears = gears;
        this.power = 100;
        this.torque = 200;
    }

    public SportsCar2(String name, String color, int numberOfDoors) {
        super(name, color, numberOfDoors);
        this.spoiler = true;
    }

}
