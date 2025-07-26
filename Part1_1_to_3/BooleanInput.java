package Part1_1_to_3;
import java.util.Scanner;

public class BooleanInput {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give me a boolean");

        boolean booleanInput = Boolean.valueOf(sc.nextLine()); // boolean input is read as a string and converted to
        // boolean either true or false true for true inputs or false for anything else

        System.out.println("you wrote " + booleanInput);
                Boolean booleanInput2 = Boolean.valueOf(sc.nextLine());
        System.out.println("you wrote " + booleanInput2);
        sc.close();
    }
}
