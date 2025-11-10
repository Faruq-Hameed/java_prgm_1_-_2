package part_10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {
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
        double average = list.stream() // use the stream map
                .mapToInt(val -> Integer.valueOf(val)) // map all to int
                .average().getAsDouble(); // get the average and get it as double
        System.out.println("average of the numbers: " + average);
    }
}
