package Tests;

public class Car extends Vehicle{

    private String numberOfSeats;
    private String type;
    private int power;

    public static void main(String[] args) {

        Car myCar = new Car("green", "4");
//        myCar.setColor("red");
//        myCar.age = 40;
//        myCar.numberOfSeats = "4";
    }

//    public Car(String color, String numberOfSeats) {
//        super(color);
//        this.numberOfSeats = numberOfSeats;
//    }
//
//    public Car(String color, String numberOfSeats, int power) {
//        super(color);
//        this.numberOfSeats = numberOfSeats;
//        this.power = power;
//    }
//
//    public Car(String color, String numberOfSeats, String type) {
//        super(color);
//        this.numberOfSeats = numberOfSeats;
//        this.type = type;
//    }


    public Car(String color, String numberOfSeats) {
        super(color);
        this.numberOfSeats = numberOfSeats;
    }

    public Car(String color, String numberOfSeats, int power) {
        this(numberOfSeats, color);
        this.power = power;
    }

    public Car(String color, String numberOfSeats, int power, String type) {
        this(numberOfSeats, color, type);
        this.power = power;
    }


    public Car(String color, String numberOfSeats, String type) {
        super(color);
        this.numberOfSeats = numberOfSeats;
        this.type = type;
    }
}
