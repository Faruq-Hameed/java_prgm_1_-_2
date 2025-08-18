package Part1_1_to_3;
import java.util.Scanner;

public class Greetings {
    static public void main  (String [] args){
        //create a tool for reading user input and name it scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("Greetings! How are you doing?");

        //Read and store the user status

        String userStatus = sc.nextLine();

        System.out.println(userStatus);

        System.out.println("Oh, how interesting. Tell me more!");

        String moreUpdates = sc.nextLine();
       

        System.out.println("Thanks for sharing!");

         sc.close();
        System.out.println("The end.");


    }

    
}
