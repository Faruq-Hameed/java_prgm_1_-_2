import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        while (true) {
            String input = getInput();
            if (input.equals("stop")) {
                break;
            }
            if (input.equals("add")) {
                System.out.println("To add:");

                add(getInput());
            }
            if (input.equals("list")) {
                print();
            }
            if (input.startsWith("remove")) {
                System.out.println("Which one is removed?");
                remove(Integer.valueOf(getInput()));

            }
        }

    }

    public String getInput() {
        return scanner.nextLine();
    }

    public void add(String task) {
        // String taskName = scanner.nextLine();
        this.todoList.add(task);
    }

    public void print() {
        this.todoList.print();
    }

    public void remove(int number) {
        this.todoList.remove(number);
    }

}
