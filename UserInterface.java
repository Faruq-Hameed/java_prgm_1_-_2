import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(Scanner scanner, TodoList todoList) {
        this.scanner = scanner;
        this.todoList = new TodoList();
    }

    public void start() {
        while (true) {
            String choice = scanner.nextLine();
            String task = scanner.nextLine();
            todoList.add(task);
        }

    }

}
