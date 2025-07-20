
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
//        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
//        printSquare(3);
//        System.out.println("\n---");
        printRectangle(5, 2);
//        System.out.println("\n---");
//        printTriangle(3);
//        System.out.println("\n---");
    }

    public static void printStars(int number) {
        String stars = "";
        int counter = 1;
        while (counter <= number) {
            stars += "*"; //add a star for every loop
            counter++; // increament the counter
        }

        System.out.println(stars);
//        return stars;
    }

    public static void printSquare(int size) {
        int counter = 1;
        while (counter <= size) {
            printStars(size);
            counter++; // increament the counter
        }
//        
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int counter = 1;

        while (counter <= height) {
            printStars(width);
            counter++;
        }
    }

    public static void printTriangle(int size) {
        int counter = 1;

        while (counter <= size) {
            printStars(counter);
            counter++;
        }
    }
}
