import java.util.Scanner;

public class Day {
    static public void main (String[] args){
        System.out.println("How many days would you like to convert to seconds?");
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine()); // Read an integer input, default to 0 if empty
        int oneDayInSeconds = 24 * 60 * 60; // Calculate seconds in one day
        int totalSecondsInProvidedDays = days * oneDayInSeconds; // Calculate total seconds in the provided days
        System.out.println(totalSecondsInProvidedDays);

        System.out.println("enter user age");
        int userAge =(int) sc.nextDouble();
        sc.close();
        System.out.println("enter user age is "+ userAge);
    }
    
}

