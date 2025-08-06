import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();
        UserInterface ui = new UserInterface(scanner, todoList);
        ui.start();
        todoList.add("Sample Task 1");
        todoList.add("Sample Task 2");
        todoList.print();
        todoList.remove(1);
        todoList.print();
        scanner.close();
    }
}
