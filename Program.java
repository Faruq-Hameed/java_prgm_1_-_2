//importing Scanner class for input from user
import java.util.Scanner;


public class Program {
    static public void main (String [] args){
        
        /// Create a tool for reading user input and name it scanner
        Scanner sc = new Scanner(System.in);


        System.out.println("Kindly enter your input");

        // Read the input from the user and store it in a variable
        String userName = sc.nextLine();

        //print the stored message

        System.out.println(userName);

        System.out.println("where are you from");
        String userAddress = sc.nextLine();

        System.out.println("How old are you?");

        String userAge = sc.nextLine();

        System.out.println("welcome " + userName + "from "
        + userAddress + ", you are " + userAge + " years old."
        ) ;

        inputFunc();
        sc.close();

    }

    static public void inputFunc (){
        System.out.println ("Write a message:");
        Scanner sc = new Scanner(System.in); // intialized the scanner

        String userTexts = sc.nextLine(); // read the input from the user

        String text = sc.nextLine();
        int integer = Integer.valueOf(sc.nextLine());
        double floatingPoint = Double.valueOf(sc.nextLine());
        boolean trueOrFalse = Boolean.valueOf(sc.nextLine());
        System.out.println(userTexts);
        sc.close();
    }
}