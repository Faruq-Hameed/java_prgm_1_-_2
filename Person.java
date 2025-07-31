public class Person {
    // declaring instance variables
    private String name;
    private int age;
    private double weight;
    private double height;

    // constructor for instantiating objects and
    public Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    public Person(double weight, double height) {
        this.name = "NA";
        this.age = 0;
        this.weight = weight;
        this.height = height;
    }

    public Person() {
        System.out.println("");
    }

    public double bodyMassIndex() {
        return this.weight / (this.height * this.height);
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }

    public String toString() {
        return this.name + ", BMI: " + this.bodyMassIndex() + " age: " + this.age
                + ", maximum heart rate: " + this.maximumHeartRate() + "height: " + this.height + " weight: "
                + this.weight;
    }
}
