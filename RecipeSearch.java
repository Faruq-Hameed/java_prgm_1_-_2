
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
            else if(command.equals("find ingredient")){
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                findByIngredient(fileName, ingredient);
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

    public static void findByIngredient(String fileName, String searchWord) {
        try {
            System.out.println("Recipes:");
            Scanner scanner = new Scanner(Paths.get(fileName));
            boolean found = false;
            while (scanner.hasNextLine()) {
                String foodName = scanner.nextLine(); // first row is the recipe name
                int cookingTime = Integer.valueOf(scanner.nextLine()); // cooking time is the second row
                // get the recipe ingredients (the third row and others)
                ArrayList<String> ingredients = new ArrayList<>();
                // loop through the recipe ingredients and break at the end of the recipe
                // ingredients for new recipe
                for (int i = 0; scanner.hasNextLine(); i++) {
                    String ingredient = scanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    // add the ingredient to the list of ingredients (if it is not empty
                    ingredients.add(ingredient);
                }
                // check if the ingredient list contains the search word
                if (ingredients.contains(searchWord)) {
                    System.out.println(foodName + " " + "cooking time: " + cookingTime);
                    continue; //i.e go to next recipe
                }

            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

}
