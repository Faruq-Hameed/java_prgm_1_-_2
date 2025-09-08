import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person faruq = new Person("Faruq", 30);
        Person faruq2 = new Person("Faruq", 30);
        Person aseda = faruq;
        System.out.println("faruq :" + faruq + " " + "faruq2 : " + faruq2 + " " + "aseda :" + aseda);
        System.out.println(faruq.equals(faruq2));
        System.out.println(faruq.equals(aseda));
        System.out.println(faruq.getClass());
        // System.out.println("-------------------");
        // System.out.println("-------------------");
        // compareBooks();
        // System.out.println("------------Testing for list-------");
        // System.out.println("-------------------");
        // checksForArrayList();
               System.out.println("------------Testing for list-------");
        System.out.println("-------------------");
        testWithHashCode();
    }

    public static void compareBooks() {
        Book book1 = new Book("Rome", 2000, "lorem ipsum");
        Book book2 = new Book("Rome", 2000, "lorem ipsum");
        Book book3 = new Book("Rome3", 2003, "lorem ipsum");
        Book book4 = book1;
        System.out.println("is 1 and 2 equal " + book1.equals(book2));// true but diff address
        System.out.println("books address : " + "\n book 1 is " + book1 + "\n book 2 is " + book2 + "\n book 3 is "
                + book3 + "\n book 4 is " + book4);
        System.out.println("is 3 and 4 equal " + book3.equals(book4));
        System.out.println("is 1 and 4 equal " + book1.equals(book4));
    }

    public static void checksForArrayList() {
        // ArrayList internally uses equals method to check if an object is already
        // present in the list
        // if we don't override equals method in our class, contains method of ArrayList
        // does not work properly
        ArrayList<Book> books = new ArrayList<>();
        Book bookObject = new Book("Book Object", 2000, "...");
        books.add(bookObject);

        if (books.contains(bookObject)) {
            System.out.println("Book Object was found.");
        }

        bookObject = new Book("Book Objects", 2001, ".Hello..");

        if (books.contains(bookObject)) {
            System.out.println("Book Object was found again.");
        }

        if (!books.contains(bookObject)) {
            System.out.println("Book Object was not found.");
        }
        System.out.println(books.size());
        System.out.println(books.get(0));
        books.set(0, bookObject);
        System.out.println("books is : " + books);

    }

    public static void testWithHashCode(){
        Book book1 = new Book("Rome", 2000, "lorem ipsum");
        Book book2 = new Book("Rome", 2000, "lorem ipsum");
        Book book3 = book1;
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        String nameA = "Faruq";
        String nameB = "Faruq";
        System.out.println(nameA.hashCode() + " " + nameB.hashCode());
    }
}
