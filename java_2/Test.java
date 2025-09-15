import java.util.Scanner;

public class Test {
    // private UserInterface userInterface;
    public static void main(String[] args) {
        UserInterface userInterfaceD = new UserInterface(new Scanner(System.in));
        userInterfaceD.addOperation(new PlusOperation());

        userInterfaceD.start();
    }
}
