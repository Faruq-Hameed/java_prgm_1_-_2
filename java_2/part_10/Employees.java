package part_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<PersonE> persons;

    public Employees() {
        this.persons = new ArrayList<>();
    }

    public void add(PersonE personToAdd) {
        this.persons.add(personToAdd);
    }

    public void add(List<PersonE> peopleToAdd) {
        // this.persons.addAll(peopleToAdd); //this too works fine
        Iterator<PersonE> iterator = peopleToAdd.iterator();
        while (iterator.hasNext()) {
            this.persons.add(iterator.next());
        }
    }

    public void print() {
        persons.stream()
                .forEach(person -> System.out.println(person));
    }

    public void print(Education education) {
        Iterator<PersonE> iterator = this.persons.iterator();
        while (iterator.hasNext()) {
            PersonE person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    /**
     * method removes all employees whose education matches the education given
     * as parameter from the employees list
     */
    public void fire(Education education) {
        Iterator<PersonE> iterator = this.persons.iterator();
        while (iterator.hasNext()) {
            PersonE person = iterator.next();
            if (person.getEducation() == education) {
                iterator.remove();
            }
        }
    }

}
