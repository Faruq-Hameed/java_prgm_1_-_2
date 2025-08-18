import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Accessing the file
        try (Scanner scanner = new Scanner(Paths.get("text.txt"))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error :" + e.getMessage());
        }
    }
}
