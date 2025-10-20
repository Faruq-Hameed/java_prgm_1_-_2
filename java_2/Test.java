import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Test {
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
        double average = list.stream() //use the stream map
                .mapToInt(val -> Integer.valueOf(val)) //map all to int
                .average().getAsDouble(); //get the average and get it as double
    }
}