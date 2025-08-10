package Tests;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Point point = new Point();
        // UserInterface userInterface = new UserInterface(scanner, point);
        // userInterface.start();
        Random random = new Random();
        int result = random.nextInt(-10);
        System.out.println("Random number generated: " + result);
    }
}
