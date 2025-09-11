package part_8;
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public boolean equals(Object object) {
        //two objects they are automatically not equal if one is null or both are from different class
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        if (object == this) {
            return true;
        }

        Person compared = (Person) object;
        //return if they are equal after the initial checks
        return (this.name.equals(compared) && this.age == compared.age);
    }
}
