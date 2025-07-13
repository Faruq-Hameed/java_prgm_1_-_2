
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        // Give a number:
        // 3
        // You gave the number 3
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine()); // Read an integer input as a string and convert it to an int
        System.out.println("You gave the number ");
        System.out.println("You gave the number " + number);
         number = (int) scanner.nextDouble(); //this stripped the decimal part if any

        System.out.println("You gave the number " + number);
        scanner.close(); // Close the scanner to prevent resource leaks

        System.out.println("Write a boolean value:");

        boolean booleanInput = scanner.nextBoolean(); // Read a boolean input

        System.out.println("You gave the boolean value: " + booleanInput);
    }

}
