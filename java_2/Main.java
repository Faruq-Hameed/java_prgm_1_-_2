import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    
    public static void main(String[] args) {
        List<Integer> listOfNumb = new ArrayList<>();
        System.out.println("Add a number");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("You inputed : " + input );
    }
}
