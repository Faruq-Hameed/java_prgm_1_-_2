import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> listOfNumb = new ArrayList<>();
        System.out.println("Add a number");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("You inputed : " + input);
        int finalCount = 0;
    double result = listOfNumb.stream()
    .mapToInt(val -> {
        int number = Integer.valueOf(val) * finalCount;
        // finalCount +=1; //I CANNOT ACCESS THIS FROM STREAM METHOD
        return number;
    })
    .filter(Main::isGreaterThan10)
    .average().getAsDouble(); // get the average and get it as double

    }

    public static boolean isGreaterThan10(int num) {
        return num > 10;
    }

}
