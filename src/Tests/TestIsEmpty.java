package Tests;

import java.awt.print.Book;

public class TestIsEmpty {

    public static void main(String[] args) {

        String title = "";
        String author = "";
        String isbn = "isbn1";

        if (title.isEmpty() && !author.isEmpty() && !isbn.isEmpty()) {
            System.out.println("stringi nie puste");
        } else {
            System.out.println("stringi są null");
        }

    }

}
