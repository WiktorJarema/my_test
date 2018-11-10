package Tests;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {

        System.out.println(getRandom1(2000000));
        System.out.println("");
        System.out.println(getRandom2(2000000));
    }

    // Sposób 1 - z klasą Random, metoda zwraca liczbę losową z zakresu 0 - max
    public static int getRandom1(int max) {
        long starTime = System.nanoTime();

        Random rand = new Random();
        int randomNumber = rand.nextInt(max + 1);

        long endTime = System.nanoTime();
        System.out.println("Time: " + (endTime - starTime));

        return randomNumber;
    }

    // Sposób 2 - z klasą Math, metoda zwraca liczbę losową z zakresu 0 - max
    public static int getRandom2(int max) {
        long starTime = System.nanoTime();

        int randomNumber = (int) (Math.random() * (max + 1));

        long endTime = System.nanoTime();
        System.out.println("Time: " + (endTime - starTime));

        return randomNumber;
    }
}
