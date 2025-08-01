public class Person {
    // declaring instance variables
    private String name;
    private int age;
    private int weight;
    private double height;

    // constructor for instantiating objects and
    public Person(String name, int age, int weight, double height) {
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

    public Person(int weight, double height) {
        this.name = "NA";
        this.age = 0;
        this.weight = weight;
        this.height = height;
    }

    public Person(){
        this("NA", 0, 0, 0);
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
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
