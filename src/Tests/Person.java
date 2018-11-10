package Tests;

public interface Person {

    String walk();

    default int getAge() {
        return 10;
    }

    default String getname() {
        return "Ania";
    }

    static String getCar() {
        return "Toyota";
    }

    String favouriteColor();
}
