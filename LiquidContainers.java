
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] inputContent = new String[2];
            inputContent = input.split(" ");
            String command = inputContent[0];
            int amount = Integer.parseInt(inputContent[1]);

            if (command.equals("add")) {
                if (first + amount <= 100 && amount > 0) {
                    first += amount;
                } else if (first + amount >= 100) {
                    first = 100;
                }

            } else if (command.equals("move")) {
                int newFirst = first - amount;
                int newSecond = second + amount;

                if (newFirst > 0) {
                    first = newFirst;
                    if (newSecond < 100) {
                        second = newSecond;
                    } else {
                        second = 100;
                    }
                } else {
                    int oldFirst = first;
                    first = 0;
                    newSecond = second + oldFirst;
                    if (newSecond < 100) {
                        second = newSecond;
                    } else {
                        second = 100;
                    }
                }
            } else if (command.equals("remove")) {
                int newSecond = second - amount;
                if (newSecond >= 0) {
                    second = newSecond;
                } else {
                    second = 0;
                }

            }

        }
    }

}
