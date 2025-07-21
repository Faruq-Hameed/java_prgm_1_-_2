
//This exercise is about printing a Christmas tree using stars and spaces.
// The tree should have a specified height, and the trunk should be centered below the tree.
public class AdvancedAstrology {

    // Print stars based on the number passed in.
    public static void printStars(int number) {
        // first part of the exercise
        int countPrinted = 0;
        while (countPrinted < number) {
            System.out.print("*");
            countPrinted = countPrinted + 1;
        }
        System.out.println("");
    }

    // Print spaces based on the number passed in.
    // This is used to center the stars in the triangle.
    public static void printSpaces(int number) {
        int counter = 1;
        while (counter <= number) {
            System.out.print(" ");
            counter++;
        }
    }

    // Print a triangle of stars with a specified size.
    // The triangle will have a number of rows equal to the size.
    // The first row will have one star, the second row will have two stars, and so
    // on.
    public static void printTriangle(int size) {
        // part 2 of the exercise
        int counter = 1;
        int spaces = size - 1;
        while (counter <= size) {
            printSpaces(spaces);
            printStars(counter);
            spaces -= 1; //
            counter++;

        }
    }

    // Print a Christmas tree with a specified height.
    // The tree will have a triangular shape with stars, and a trunk at the bottom.
    public static void christmasTree(int height) {
        // part 3 of the exercise
        // int rows = 1;
        int counter = 1;
        int rows = 1;
        int spaces = height - 1;

        while (rows <= height) {
            printSpaces(spaces); // print space to the left
            printStars(counter);
            spaces -= 1; //
            counter += 2;
            rows++;

        }
        printSpaces(height - 2); //

        printStars(3);
        printSpaces(height - 2); //

        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        // printStars(3);
        // printTriangle(5);
        // System.out.println("---");
        christmasTree(5);
        // System.out.println("---");
        // christmasTree(10);
    }
}
