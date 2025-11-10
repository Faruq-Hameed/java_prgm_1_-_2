package part_10;
import java.util.Scanner;

public class RegexTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to test: ");
        String name = scanner.nextLine();
        boolean isItMatched = isItMatches(name);
        System.out.println("Does it match the criteria? " + isItMatched);

        boolean directMatch = name.matches("01[0-9]{7}");
        System.out.println("Direct regex match result: " + directMatch);

        if (name.matches("01|02|03")) {
            System.out.println("Matched one of the specified patterns.");
        }
        scanner.close();

        // String string = "trolololololo";

        // if (string.matches("trolo(lo)*")) {
        // System.out.println("Correct form."); //returns true
        // } else {
        // System.out.println("Incorrect form.");
        // }

        // The quantifier + repeats 1 ... times, for example;
        // String string = "trolololololo";

        // if (string.matches("tro(lo)+")) {
        // System.out.println("Correct form.");
        // } else {
        // System.out.println("Incorrect form.");
        // }
        // Sample output
        // Correct form.

        // String string = "nananananananana Batmaan!";

        // if (string.matches("(na)+ Batmaan!")) {
        // System.out.println("Correct form.");
        // } else {
        // System.out.println("Incorrect form.");
        // }
        // Sample output
        // Correct form.

        // The quantifier ? repeats 0 or 1 times, for example:
        // String string = "You have to accidentally the whole meme";

        // if (string.matches("You have to accidentally (delete )?the whole meme")) {
        // System.out.println("Correct form.");
        // } else {
        // System.out.println("Incorrect form.");
        // }
        // Sample output
        // Correct form.

        // The quantifier {a} repeats a times, for example:
        // String string = "1010";

        // if (string.matches("(10){2}")) {
        // System.out.println("Correct form.");
        // } else {
        // System.out.println("Incorrect form.");
        // }
        // Sample output
        // Correct form.

        // The quantifier {a,b} repeats a ... b times, for example:
        // String string = "12222";

        // if (string.matches("1(3)*")) {
        // System.out.println("Correct formed.");
        // } else {
        // System.out.println("Incorrect formed.");
        // }
        // Sample output
        // Incorrect form.

        // The quantifier {a,} repeats a ... times, for example:
        // String string = "11111";

        // if (string.matches("1{2,}")) {
        // System.out.println("Correct form.");
        // } else {
        // System.out.println("Incorrect form.");
        // }
        // Sample output
        // Correct form.
    }

    public static boolean isItMatches(String name) {
        boolean itMatches = false;

        int length = name.length();
        char char0 = name.charAt(0);
        char char1 = name.charAt(1);
        if (length == 9 && char0 == '0' && char1 == '1') {
            System.out.println("It starts with 01 and length is at least 9.");
            int count = 2;
            while (count < length) {
                char currentChar = name.charAt(count);
                if (Character.isDigit(currentChar)) {
                    count++;
                    itMatches = true;
                } else {
                    itMatches = false;
                    System.out.println("Failed at position: " + count);
                    break;
                }
            }

        } else {
            System.out.println("It failed primarily at position:");
        }

        return itMatches;
    }
}
