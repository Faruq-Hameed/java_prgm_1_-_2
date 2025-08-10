import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.persons.add(person); // add someone to the list
    }

    public boolean isEmpty() {
        return this.persons.isEmpty(); // check if room is empty return true or false
    }

    public ArrayList<Person> getPersons() { // return the list of persons in the room
        return this.persons;
    }

    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }
        Person shortestPerson = persons.get(0);
        for (Person person : persons) {
            if (person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }

    public Person take() {
        if (this.isEmpty()) {
            return null;
        }
        Person shortestPerson = persons.get(0);
        int shortestIndex = 0;
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            if (person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
                shortestIndex = i;

            }
        }

        return this.persons.remove(shortestIndex); // remove first person from the list
    }
}
