import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        long count = people.stream()
                .filter(p -> p.getBirthYear() < 1970)
                .count();
        System.out.println("Number of people born before 1970: " + count);

        long countTwo = people.stream()
                .filter(p -> p.getFirstName().startsWith("A"))
                .count();
        System.out.println("Number of people with first name starting with 'A': " + countTwo);

        people.stream()
                .map(p -> p.getFirstName().toUpperCase())
                // get unique first names in uppercase
                .distinct()
                .sorted()
                .forEach(name -> System.out.println(name));
    }
}