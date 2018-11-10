// Wersja z lekcji
package Tests;

import java.util.Scanner;

public class Dzien4WprowadzanieDanychMain4 {

    public static void main(String[] args) {
        rowsColumns();
    }

    static void rowsColumns() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe rzedow: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("To nie liczba :<");
        }
        int rows = scanner.nextInt();
        System.out.println("Podaj liczbe kolumn: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("To nie liczba :<");
        }
        int columns = scanner.nextInt();
        int counter = 0;
        int array[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = counter;
                counter++;
            }

        }
        int sum = 0;
        int elements = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += array[i][j];
            }
            elements += array[i].length;
        }
        System.out.println("Suma: " + sum);
        System.out.println("Srednia: " + sum / elements);
    }

}
