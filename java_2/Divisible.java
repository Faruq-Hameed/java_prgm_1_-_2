
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);
        System.out.println("Before looping");
        divisible.stream()
                .forEach(luku -> System.out.println(luku));
        System.out.println("After looping");
        int sumOfDivisible = divisible.stream()
        .reduce(0, (pre, val) -> pre + val);

    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        ArrayList<Integer> output = numbers.stream()
                // .filter(num -> num % 2 == 0 || num % 3 == 0 || num % 5 == 0)
                // .collect(Collectors.toCollection(ArrayList::new));
                .filter(num -> {
                    return num % 2 == 0 || num % 3 == 0 || num % 5 == 0;

                })
                .collect(Collectors.toCollection(ArrayList::new));

        return output;
    }

}
