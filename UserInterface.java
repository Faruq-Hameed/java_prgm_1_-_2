import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list) {
        this.list = list;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Command: ");
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.println("To add:");
                String task = scanner.nextLine();
                list.add(task);
            }
            if (command.equals("list")) {
                list.print();
            }

            if (command.equals("remove")) {
                System.out.println("Which one is removed");
                int index = scanner.nextInt();
                list.remove(index);
            }
        }

    }
}