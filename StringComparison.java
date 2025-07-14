import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give the first text:");
        String firstText = reader.nextLine();

        System.out.println("Give the second text:");
        String secondText = reader.nextLine();

        if (firstText == secondText) {
            System.out.println("Text are equal. They are :" + firstText + " and "+ secondText);
        }
         else  {
            System.out.println("Text are not equal. They are :" + firstText + " and "+ secondText);
        }

         System.out.println("Give the third text:");
        String thirdText = reader.nextLine();

        System.out.println("Give the forth text:");
        String forthText = reader.nextLine();

        if (thirdText.equals(forthText)) {
            System.out.println("Text are equal. They are :" + thirdText + " and "+ forthText);
        }
         else  {
            System.out.println("Text are not equal. They are :" + thirdText + " and "+ forthText);
        }
    }

}
