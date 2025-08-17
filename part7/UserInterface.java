package part7;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the Grading Program!");
        
        while (true) {
            int number = Integer.valueOf(this.scanner.nextLine());
        }
    }
}
