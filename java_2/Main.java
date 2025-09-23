import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TextMessage message = new TextMessage("Faruq", "hello world");
        message.read();

        ArrayList<TextMessage> messages = new ArrayList<>();
        messages.add(message);

        ArrayList<String> pages = new ArrayList<>();
        pages.add("First page");
        pages.add("Second page");
        pages.add("Third page");
        pages.add("Fourth page");

        Ebook ebooks = new Ebook("test book", pages);

        int page = 0;
        while (page < ebooks.pages()) {
            System.out.println(ebooks.read());
            page += 1;

        }

    }
}
