
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        int smallestNumber = 9999;
        // after that, the program prints the smallest number
        for (int i = 0; i < list.size(); i++) {
            int currentNumber = list.get(i);
            if (smallestNumber > currentNumber) {
                smallestNumber = currentNumber;
            }
        }
        if (smallestNumber == 9999) { // i.e nothing was added
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            int currentNumber = list.get(i);
            if (smallestNumber == currentNumber) {
                System.out.println("Smallest number: " + smallestNumber + " Found at index: " + i);
            }
        }
        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("Simon");
        teachers.add("Samuel");
        teachers.add("Ann");
        teachers.add("Anna");

        for(String teacher: teachers){
            System.out.println(teacher);
        }

        // and its index -- the smallest number
        // might appear multiple times

    }
}
