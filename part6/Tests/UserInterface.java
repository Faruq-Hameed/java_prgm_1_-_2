package Tests;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Point point;

    public UserInterface(Scanner scanner, Point point) {
        this.scanner = scanner;
        this.point = point;
    }

    public void start() {
        while (true) {
            System.out.println("Points:");
            String input = getInput();
            if (input.isEmpty()) {
                point.printGrades();
                break;
            } else {
                point.addPoint(Integer.valueOf(input));
            }

        }

    }

    public String getInput() {
        return scanner.nextLine();
    }

}
