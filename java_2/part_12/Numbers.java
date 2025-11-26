package part_12;
import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("How many random numbers should be printed?");
        Scanner sc = new Scanner(System.in);

        int upperLimit = Integer.parseInt(sc.nextLine());
        int count = 1;
        Random random = new Random();

        while (count <= upperLimit) {

            System.out.println(random.nextInt(10));
            count++;
        }
    }
}
