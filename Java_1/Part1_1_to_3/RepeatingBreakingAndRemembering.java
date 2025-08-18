package Part1_1_to_3;

import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int count = 0;
        double average = 0.0;
        int even = 0;
        int odd = 0;
        boolean shouldContinue = true;
        while (shouldContinue) {
            int number = scanner.nextInt();
            // If the input is -1, break the loop
            if (number != -1) {
                sum += number; // Add the number to the sum
                count++; // Increment the count of numbers
                average = (double) sum / count;
                if (number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                continue;
            } else {
                break;

            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
