package part_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Integer> positive(List<Integer> numbers) {
        ArrayList<Integer> result = numbers.stream() //
                .filter(PositiveNumbers::isPositive)
                .collect(Collectors.toCollection(ArrayList::new));
        return result;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static long counting() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(17);
        numbers.add(8);
        numbers.add(0);
        long result = numbers.stream().count();
        return result;
    }

    public static void simplePrinter(List<Integer> numbers) {
        numbers.stream().filter(num -> num > 2).forEach(num -> {
            System.out.println("current number is: " + num);
            return;
        });

    }
}
