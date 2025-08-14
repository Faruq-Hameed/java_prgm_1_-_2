
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");

        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("list")) {
                list(fileName);
            } else if (command.equals("stop")) {
                break;
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String searchWord = scanner.nextLine();
                findByName(fileName, searchWord);
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());
                findCookingTime(fileName, time);
            }

        }
    }

    public static void list(String fileName) {
        try {
            System.out.println("Recipes:");
            Scanner scanner = new Scanner(Paths.get(fileName));
            int rowCounter = 0;
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (row.isEmpty()) {
                    rowCounter = 0;
                    continue;
                } else if (rowCounter == 0) {
                    System.out.print(row + ", ");
                    rowCounter++;
                    continue;
                }
                if (rowCounter == 1) {
                    System.out.print("cooking time: " + Integer.valueOf(row));
                    System.out.println();
                    rowCounter++;
                    continue;
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void findByName(String fileName, String searchWord) {
        try {
            System.out.println("Recipes:");
            Scanner scanner = new Scanner(Paths.get(fileName));
            int rowCounter = 0;
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (row.isEmpty()) {
                    rowCounter = 0;
                    continue;
                } else if (rowCounter == 0 && row.contains(searchWord)) {
                    System.out.print(row + ", ");
                    rowCounter++;
                    continue;
                }
                if (rowCounter == 1) {
                    System.out.print("cooking time: " + Integer.valueOf(row));
                    System.out.println();
                    rowCounter++;
                    continue;
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void findCookingTime(String fileName, int time) {
        try {
            System.out.println("Recipes:");
            Scanner scanner = new Scanner(Paths.get(fileName));
            int rowCounter = 0;
            String foodName = "";
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (row.isEmpty()) {
                    rowCounter = 0;
                    continue;
                } else if (rowCounter == 0) {
                    foodName = row + ", ";
                    rowCounter++;
                    continue;
                }
                if (rowCounter == 1) {
                    int cookingTime = Integer.valueOf(row);
                    if (cookingTime <= time) {
                        System.out.println(foodName + "cooking time: " + cookingTime);
                    }
                    foodName = "";
                    rowCounter++;
                    continue;
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

}
