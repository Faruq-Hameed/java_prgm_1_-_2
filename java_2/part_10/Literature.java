package part_10;
public class Literature {
    private String name;
    private int age;

    public Literature(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getName() + " (recommended for " + this.getAge() + " year-olds or older)";
    }

    public static void main(String[] args) {
    }
}
