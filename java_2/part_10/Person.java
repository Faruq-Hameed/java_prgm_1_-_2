package part_10;
import java.util.ArrayList;
import java.util.Collections;

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

        people.stream()
                .mapToInt(person -> person.getBirthYear())
                .average()
                .getAsDouble();

        // another
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Ada Lovelace", "hello", 1815));
        persons.add(new Person("Irma Wyman", "hello", 1928));
        persons.add(new Person("Grace Hopper", "hello", 1906));
        persons.add(new Person("Mary Coombs", "hello", 1929));

        persons.stream().sorted((p1, p2) -> { //this does not mutate original list but returns a sorted stream
            return p1.getBirthYear() - p2.getBirthYear();
        }).forEach(p -> System.out.println(p.getFirstName())); //print sorted stream

        System.out.println();

        persons.stream().forEach(p -> System.out.println(p.getFirstName())); //original list

        System.out.println();

        Collections.sort(persons, (p1, p2) -> p1.getBirthYear() - p2.getBirthYear()); //sort original list

        persons.stream().forEach(p -> System.out.println(p.getFirstName())); //sorted original list
    }
}