import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FilesReader {

    public static void main(String[] args) {
        // scanner for user input
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = inputScanner.nextLine();
        // firstly loop all the names into an array list where we then be checking from
        ArrayList<String> names = new ArrayList<>();

        try (Scanner file = new Scanner(Paths.get(fileName))) {

            // // firstly loop all the names into the list
            while (file.hasNextLine()) {
                names.add(file.nextLine());
            }

            for (int i = 0; i < names.size(); i++) {
                // System.out.println("Enter names, an empty line quits");
                String name = inputScanner.nextLine();
                if (name.isEmpty()) {
                    // System.out.println("Thank you!");
                    break;
                }
                if (names.contains(name)) {
                    System.out.println("The name is on the list.");
                } else {
                    System.out.println("The name is not on the list.");
                }
                System.out.println("Thank you!");

            }

        } catch (Exception e) {
            // TODO: handle exception
        }
        inputScanner.close();
    }

}
