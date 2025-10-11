package part_9;
import java.util.ArrayList;

public class Book {
    private String name;
    private int age;

    public Book(String name, int age){
        this.name= name;
        this.age = age;
    }
    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        Book book1 = new Book("shake", 9);
        Book book2 = new Book("shake", 9);
        System.out.println(book1.equals(book2));
        System.out.println(book1);
        System.out.println(book2);

        String firstName = "faruq";
        String lastName = "Hameed";
        System.out.println("is first equals last = " + firstName.equals(lastName));
        ArrayList<String> strings = new ArrayList<>();
        strings.add(lastName);
        strings.add(firstName);

        strings.add(lastName);

        ArrayList<String> stringsB = new ArrayList<>();
        stringsB.add(lastName);
        stringsB.add(firstName);

        stringsB.add(lastName);
        System.out.println(firstName);
        System.out.println(strings);
        System.out.println(stringsB);
        
        System.out.println(stringsB.equals(strings));
    }
}