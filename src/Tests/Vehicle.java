package Tests;

public class Vehicle {

    private String color;
    private String name;
    public int age;
    public String producer;

    public Vehicle(String color) {
        this.color = color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProducer() {
        return producer;
    }


}
