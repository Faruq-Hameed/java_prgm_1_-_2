import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Operation> operations;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.operations = new ArrayList<>();
    }

    /** Method to add a new operation */
    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    public void start() {
        while (true) {
            printOperations();// list all operations
            System.out.println("Choice: ");

            String choice = scanner.nextLine();
            if (choice.equals("0")) {
                break;
            }
            executeOperation(choice); // execute the chosen operation
        }
    }

    /** methods to print list of operations */
    private void printOperations() {
        System.out.println("\t0: Stop");
        int i = 0;
        while (i < this.operations.size()) {
            String operationName = this.operations.get(i).getName();
            System.out.println("\t" + (i + 1) + ": " + operationName);
            i = i + 1;
        }
    }

    /** Method to execute a chosen operation */
    public void executeOperation(String choice) {
        int operationIndex = Integer.valueOf(choice);
        Operation chosenOperation = this.operations.get(operationIndex - 1);
        chosenOperation.execute(this.scanner);
    }
}
