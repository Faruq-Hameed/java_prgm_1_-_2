import java.util.ArrayList;

public class Book {
    public static void main(String[] args) {
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