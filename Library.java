import java.util.HashMap;

public class Library {
    private HashMap<String, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public Book getBook(String title) {
        return books.get(title);
    }

    public void addBook(Book book) {
        String name = book.getName();
        if (name == null) {
            name = "";
        }
        name = name.trim().toLowerCase();
        if (books.containsKey(name)) {
            System.out.println("Book is already in the library!");
        } else {
            books.put(name, book);
        }

    }

    @Override
    public String toString() {
        return books;
    }
}