package Operacje_na_plikach;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ZapisDoPliku {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();
//        myList.add("Pies");
//        myList.add("Kot");
//        myList.add("Samochód");
//        myList.add("Samolot");
        readFromFileNIO(myList);
        writeToFileNIO(myList);

    }

    // ***Zapis i odczyt z pliku za pomocą java.io***

    // zapis do pliku za pomocą klasy PrintWriter i File (o PrintWriter było na kursie)
    static void writeToFileIO1(ArrayList<String> list) {
        File file = new File("src/Operacje_na_plikach/Plik1.txt");
        try (PrintWriter writer = new PrintWriter(file)) {
            for (String element: list) {
                writer.println(element);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Problem z plikiem");
        }
    }

    // zapis do pliku za pomocą klasy FileWriter i File (o FileWriter było w książce)
    // różnice między FileWriter a PrintWriter są nieznaczne, o tym u mnie w notatkach
    static void writeToFileIO2(ArrayList<String> list) {
        File file = new File("src/Operacje_na_plikach/Plik2.txt");
        try (FileWriter writer = new FileWriter(file)) {
            for (String element: list) {
                writer.write(element);
            }
        } catch (IOException e) {
            System.out.println("Problem z plikiem");
        }
    }

    // Zapis do pliku za pomocą klasy FileWriter i File oraz z wykorzystaniem bufora Klasy BufferedWriter
    static void writeToFileIO3(ArrayList<String> list) {
        File file = new File("src/Operacje_na_plikach/Plik3.txt");

        try (FileWriter writer = new FileWriter(file);
             BufferedWriter fileWriter = new BufferedWriter(writer)) {
            for (String element: list) {
                fileWriter.write(element);
            }
        } catch (IOException e) {
            System.out.println("Problem z plikiem");
        }
    }


    // Odczyt z pliku za pomocą klasy FileWriter i File - nie da się tak, trzeba skorzystać ze strumienia "łańcuchowego" BufferedReader
    // Na kursie korzystaliśmy ze Scannera, nie lubię tego sposobu, ale go tu umieszczam
    static void readFromFileIO1(ArrayList<String> list) {
        File file = new File("src/Operacje_na_plikach/Plik1.txt");

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                list.add(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Problem z plikiem");
        }
    }

    // Odczyt z pliku za pomocą klasy BufferedReader, FileReader i File
    static void readFromFileIO2(ArrayList<String> list) {
        File file = new File("src/Operacje_na_plikach/Plik2.txt");

        try (FileReader reader = new FileReader(file);
             BufferedReader fileReader = new BufferedReader(reader)) {
            String currentLine = null;
            while ((currentLine = fileReader.readLine()) != null) {
                list.add(currentLine + "\n");
            }
        } catch (IOException e) {
            System.out.println("Problem z plikiem");
        }
    }





    // ***Zapis i odczyt z pliku za pomocą java.nio***

    // Zapis do pliku za pomocą klasy Files i Path z pakietu
    static void writeToFileNIO(ArrayList<String> list) {
        Path path = Paths.get("src/Operacje_na_plikach/Plik1.txt");
        try {
            Files.write(path, list);
        } catch (IOException e) {
            System.out.println("Problem z plikiem");
        }
    }

    // Oczyt do pliku za pomocą klasy Files i Path z pakietu
    // wygląda na to, że główny powód do użycia java.nio do zapisu do pliku jest metoda readAllLines klasy Files
    static void readFromFileNIO(ArrayList<String> list) {
        Path path = Paths.get("src/Operacje_na_plikach/PlikDoOdczytu.txt");
        try {
            for (String currentLine : Files.readAllLines(path)) {
                list.add(currentLine);
            }
        } catch (IOException e) {
            System.out.println("Problem z plikiem");
        }
    }

}
