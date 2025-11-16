import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Show {
    private String movie;
    private String time;

    public static void main(String[] args) throws Exception {

        PrintWriter writer = new PrintWriter("text.txt");
        writer.println("Hello file!"); // writes the string "Hello file!" and line change to the file
        writer.println("More text");
        writer.print("And a little extra"); // writes the string "And a little extra" to the file without a line change
        writer.close(); // closes the

        System.out.println("" + generateNum());
        Scanner scanner = new Scanner(System.in);
        System.out.println("start typing");
        PrintWriter printer = new PrintWriter("file.txt");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            printToFile(input, printer);

        }
        printer.close();
        System.out.println("Writing completed");
        System.out.println("Reading started");

        Scanner reader = new Scanner(new File("text.txt"));

        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        System.out.println("Reading completed");
    }

    private static int generateNum() {
        return new Random().nextInt(-30, 0);
    }

    private static void printToFile(String content, PrintWriter printer) throws Exception {
        printer.println(content);

    }
}
