
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
    String name = scanner.nextLine();  
        System.out.println(name);
        System.out.println("What is their job?");
    String job = scanner.nextLine();
            System.out.println(job);
            System.out.println("Here is the story:");
                    System.out.println("Once upon a time there was " + name + " , who was a " + job + ". On the way to work, "+ name + " reflected on life. Perhaps "+ name+ " will not be a "+ job +" forever.");

//        System.out.println("Here is the story: Once upon a time there was " + name + " , who was a " + job + ". On the way to work, "+ name + " reflected on life. Perhaps "+ name+ " will not be a "+ job +" forever.");
    }
}
