
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
}
