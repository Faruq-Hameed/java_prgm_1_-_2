package Tesr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Title: To Kill a Mockingbird
            System.out.println("Title:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages:");
            int pages = scanner.nextInt();

            System.out.println("Publication year:");
            int year = scanner.nextInt();

            // create book object
            Book book = new Book(title, pages, year);

            // add object to the list
            books.add(book);
        }

        System.out.println("What information will be printed?");
        String neededInfo = scanner.nextLine();
        for (Book book : books) {
            if (neededInfo.equals("everything")) {
                System.out.println(book.toString());
            } else if (neededInfo.equals("name")) {
                System.out.println(book.getName());
            } else if (neededInfo.equals("pages")) {
                System.out.println(book.getPages());
            } else if (neededInfo.equals("year")) {
                System.out.println(book.getYear());
            } else {
                System.out.println("Invalid input");
            }

        }
    }

}
