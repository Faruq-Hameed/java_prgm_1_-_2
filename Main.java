import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // TodoList todoList = new TodoList();
        // UserInterface ui = new UserInterface(todoList, scanner );
        // ui.start();
        // todoList.add("Sample Task 1");
        // todoList.add("Sample Task 2");
        // todoList.print();
        // todoList.remove(1);
        // todoList.print();
        // scanner.close();
        String input = "one\n" + "two\n" +
                "three\n" + "four\n" +
                "five\n" + "one\n" +
                "six\n";

        Scanner reader = new Scanner(input);

        ArrayList<String> read = new ArrayList<>();
        int count = 0;
        while (true) {
            System.out.println("Enter an input: ");
            String line = reader.nextLine();
            System.out.println(count +": Input received: " + line);
            if (read.contains(line)) {
            System.out.println(count +": Input received: " + line);

                break;
            }
            count++;

            read.add(line);
        }

        System.out.println("Thank you!");

        if (read.contains("six")) {
            System.out.println("A value that should not have been added to the group was added to it.");
        }
    }
}
