package part_8;
import java.util.HashMap;

public class Borrower {
    public static void main(String[] args) {
    HashMap<Book, String> borrowers = new HashMap<>();
    Book boo1 = new Book("Rome and Juliet", 2000, "lorem ipsum");
    borrowers.put(boo1, "Faruq");

    borrowers.put(new Book ("Tale of forest", 2001, "lorem ipsum"), "Aseda");
        
    // System.out.println(borrowers);
    // System.out.println("get book1 : " + borrowers.get(boo1));
    borrowers.put(new Book ("Tale of forest", 2001, "lorem ipsum"), "Aseda");
    borrowers.put(new Book ("Tale of forest", 2001, "lorem ipsum"), "Aseda");
    borrowers.put(new Book ("Tale of forest", 2001, "lorem ipsum"), "Aseda");
    borrowers.put(new Book ("Tale of forest", 2001, "lorem ipsum"), "Aseda5");

    System.out.println(borrowers);
    }
}
