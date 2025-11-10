package part_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = reader.nextLine();
            if (input.equals("end")) {
                break;
            }
            list.add(input);
        }
        double average = 0.0;
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String command = reader.nextLine();
        if (command.equals("n")) {
            average = list.stream()
                    .mapToInt(val -> Integer.valueOf(val))
                    .filter(num -> num < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        } else if (command.equals("p")) {
            average = list.stream()
                    .mapToInt(val -> Integer.valueOf(val))
                    .filter(num -> num > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }

    }
}
