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
        /*
         * Sample output
Greetings! How are you doing?
 Good thanks! 
Oh, how interesting. Tell me more!
 Well, there's really nothing to tell. 
Thanks for sharing!
         */


    }

    
}
