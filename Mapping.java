import java.util.HashMap;

public class Mapping {

    public static void main(String[] args) {
        HashMap<String, Book> bookMap = new HashMap<>();
        for (int i = 1; i <= 7; i++) {
            if (i % 2 == 0) {
                Book book = new Book("Book" + i + "even", i, "Content lorem" + i);
                bookMap.put(book.getName(), book);

            } else {
                Book book = new Book("Book" + i + "even", i, "Content lorem" + i);
                bookMap.put(book.getName(), book);
            }
        }
       for (String bookName : bookMap.keySet()) {
        Book book = bookMap.get(bookName);
        System.out.println(book);
       }
    }
}
