import java.util.Scanner;

public class Variable {
    static public void main (String [] args){
        int  age = 10;
        Boolean isStudent = true;
        String school = "Unibadan";

        // school = 7; // This will cause an error because school is a String, not an int
        school = "7";
        String userProfile =  String.valueOf(age) + isStudent + school + age + String.valueOf(isStudent) +  age + String.valueOf(isStudent);

        // age = 20.00; // This will cause an error because age is an int, not a double
        // age = (int) 20.00; // Correct way to assign a double to

        double dbl = 20.01;

        dbl = age; // This is fine, as Java can convert int to double
        System.out.println(dbl); //10.0 will be printed instead of 10
        System.out.println(userProfile);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int userAge = sc.nextLine(); // Read an integer input
        System.out.println(userAge);
        
    }
}
