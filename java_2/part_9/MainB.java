package part_9;
public class MainB {
    public static void main(String[] args) {
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd);

        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fide = new Dog("Fido");
        fide.eat();
    }
}
