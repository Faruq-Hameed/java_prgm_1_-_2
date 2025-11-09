import java.util.Scanner;

public class RegexTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to test: ");
        String name = scanner.nextLine();
        boolean isItMatched = isItMatches(name);
        System.out.println("Does it match the criteria? " + isItMatched);
        scanner.close();

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
