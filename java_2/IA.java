import java.io.File;
import java.rmi.NotBoundException;
import java.util.Scanner;

public class IA {
    public static void main(String[] args) throws Exception {
        try {
            print();
            throw new NotBoundException("Not bounded");

        } catch (Exception e) {
            System.out.println("Error occurred. " + e);
            // TODO: handle exception
        }
        throw new IllegalArgumentException("Illegal");
        // System.out.println("hello");
    }

    public static void print() throws Exception {
        Scanner reader = new Scanner(new File("index.html"));
        System.out.println("Kindly type a number");

        int count = 1;
        while (reader.hasNextLine()) {
            System.out.println("[" + count + "] " + reader.nextLine());
            count++;
        }
        System.out.println("Completed file reading");
    }
}
