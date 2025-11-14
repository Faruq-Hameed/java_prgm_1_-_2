package part1_4_oop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Accessing the file
        try (Scanner scanner = new Scanner(Paths.get("./part1_4_oop/text.txt"))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
            File file = new File("./part1_4_oop/another.txt");
            // String text = Files.readString(Paths.get("data.txt"));
            Files.writeString(Paths.get("./part1_4_oop/text.txt"), "jhbdfgnd \n jsjh",
                    java.nio.file.StandardOpenOption.APPEND);

            boolean created = file.createNewFile();
            System.out.println("was file created: " + created);
            BufferedWriter writer = new BufferedWriter(new FileWriter("./part1_4_oop/text.md", true));

            BufferedReader reader = new BufferedReader(new FileReader("./part1_4_oop/text.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            writer.write(line);
            writer.newLine();

            }
            writer.close();
            reader.close();
          
            // writer.write("Hello", true);
            // writer.newLine();
            // writer.write("World");
            // writer.close();
            // reader.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error :" + e.getMessage());
        }
    }
}
