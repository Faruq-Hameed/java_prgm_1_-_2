import java.util.HashMap;

public class Library {
    private HashMap<String, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public Book getBook(String bookName) {
        bookName = sensitizedString(bookName);
        return books.get(bookName);
    }

    public void addBook(Book book) {
        String name = sensitizedString(book.getName());
        if (books.containsKey(name)) {
            System.out.println("Book is already in the library!");
        } else {
            books.put(name, book);
        }

    }

    public String sensitizedString(String name) {
        if (name == null) {
            return "";
        }
        name = name.trim().toLowerCase();
        return name;
    }

    public void removeBook(String bookName) {
        bookName = sensitizedString(bookName);
        if (books.containsKey(bookName)) {
            books.remove(bookName);
        } else {
            System.out.println("Book was not found, cannot be removed!");
        }
    }
    // @Override
    // public String toString() {
    // return books;
    // }
}