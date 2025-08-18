import java.util.ArrayList;
import java.util.HashMap;

public class Person {
    private String name;
    private String nick;

    public Person(String name, String nick) {
        this.name = name;
        this.nick = nick;

    }

    public String getName() {
        return name;
    }

    public String getNick() {
        return nick;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public static void main(String[] args) {
        HashMap<String, Person> mapPersons = new HashMap<>();
        ArrayList<Person> listPersons = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Person person = new Person("name" + i, "nick" + i);
            mapPersons.put(person.getName(), person);
            listPersons.add(person);
        }
        System.out.println(mapPersons.get("name5"));
        // System.currentTimeMillis()

    }

}
