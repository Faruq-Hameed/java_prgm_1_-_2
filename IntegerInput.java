
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        // Give a number:
        // 3
        // You gave the number 3
        System.out.println("Give a number:");
        int number = Integer.parseInt(scanner.nextLine()); // Read an integer input as a string and convert it to an int
        scanner.close(); // Close the scanner to prevent resource leaks
        System.out.println("You gave the number " + number);
    }

}
