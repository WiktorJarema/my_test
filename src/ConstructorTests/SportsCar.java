package ConstructorTests;

public class SportsCar extends Car {

    boolean spoiler;
    int power;
    int torque;
    int gears;

    public SportsCar(String name, String color, int numberOfDoors, int power, int torque, int gears) {
        super(name, color, numberOfDoors);
        this.spoiler = true;
        this.power = power;
        this.torque = torque;
        this.gears = gears;
    }

    public SportsCar(String name, String color, int numberOfDoors, int power, int torque) {
        super(name, color, numberOfDoors);
        this.spoiler = true;
        this.power = power;
        this.torque = torque;
    }

    public SportsCar(String name, String color, int numberOfDoors, int gears) {
        super(name, color, numberOfDoors);
        this.gears = gears;
        this.spoiler = true;
        this.power = 100;
        this.torque = 200;
    }

}
