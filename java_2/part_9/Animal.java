package part_9;
// Animal.java

public abstract class Animal {

    private String name; // use private instead of protected for encapsulation

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + " eats");
    }

    public void sleep() {
        System.out.println(this.name + " sleeps");
    }

    public String getName() {
        return this.name;
    }
}
