import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        System.out.println("Give points [0-100]:");
        Scanner scan = new Scanner(System.in);
        int point = scan.nextInt();
        String grade;

        if (point < 0) {
            grade = "impossible!";
        } else if (point >= 0 && point < 50) {
            grade = "failed";
        } else if (point >= 50 && point < 60) {
            grade = "1";
        }

        else if (point >= 60 && point < 70) {
            grade = "2";
        } else if (point >= 70 && point < 80) {
            grade = "3";
        } else if (point >= 80 && point < 90) {
            grade = "4";
        } else if (point >= 90 && point <= 100) {
            grade = "5";
        } else {
            grade = "incredible!";
        }

        System.out.println("Grade: " + grade);
        scan.close();
    }
}
