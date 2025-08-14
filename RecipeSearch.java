
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    // private ArrayList<String> recipeNames;
    // private ArrayList<Integer> cookingTimes;

    // public RecipeSearch() {
    // this.recipeNames = new ArrayList<>();
    // this.cookingTimes = new ArrayList<>();

    // }

    public static void reading(String fileName) {
        try {
            Scanner scanner = new Scanner(Paths.get(fileName));
            int rowCounter = 0;
            while (scanner.hasNextLine()) {
                String row = scanner.next();
                if (row.isEmpty()) {
                    rowCounter++;
                    continue;
                } else if (rowCounter == 0) {
                    System.out.println("");
                }
                // System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }
    // Commands: list - lists the recipes stop - stops the program

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
                // System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }
    // Commands: list - lists the recipes stop - stops the program

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        System.out.println("Commands:");
        //
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");

        System.out.println("Enter command: ");
        String command = scanner.nextLine();
        while (condition) {

        }

        String fileName = scanner.nextLine();
        // reading(fileName);

        if (command.equals("list")) {
            list(fileName);
        }
        System.out.println("Enter command: ");
        command = scanner.nextLine();

    }

}
