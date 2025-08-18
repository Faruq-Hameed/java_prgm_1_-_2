package part1_4_oop;
public class Person {
    private String name;
    private int age;

    public Person (String name){
        this.name = name;
        this.age =0;
    }

    public String toString(){
        return "Name: " + this.name + "\nAge: " + this.age;
    
    }
    public static void main(String[] args) {
        Person p1 = new Person("John");
        System.out.println(p1);

    }

}
