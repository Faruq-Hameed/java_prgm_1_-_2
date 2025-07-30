package part1_4_oop;
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        // we create the object integers from the ArrayList class.
        // So all methods of the class will be available for this object too
        // we instantiate an object using by calling the method that created an object i.e the constructor
        // by using new keyword with the Class
        ArrayList<Integer> integers = new ArrayList<>();

        //using the add method provided by ArrayList for all it objects
        integers.add(6);
        integers.add(9);
        integers.add(10);

        //using the size method
        System.out.println(integers.size());
    }
}
