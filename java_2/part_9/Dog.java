package part_9;
public class Dog extends Animal implements NoiseCapable {

    public Dog() {
        super("Dog");
    }

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() + " barks");
    }

    public void makeNoise() {
        this.bark();
    }

}
