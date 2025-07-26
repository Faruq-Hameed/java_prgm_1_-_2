package Part1_1_to_3;
import java.util.Scanner;

public class GiftTax {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double giftValue = reader.nextDouble();
        double taxRate = 0;
        int minimumValue = 0;
        int minimumTax = 0;

        if (giftValue >= 5000 && giftValue < 25000) {
            taxRate = 8;
            minimumTax = 100;
            minimumValue = 5000;

        } else if (giftValue >= 25000 && giftValue < 55000) {
            taxRate = 10;
            minimumTax = 1700;
            minimumValue = 25000;
        } else if (giftValue >= 55000 && giftValue < 200000) {
            taxRate = 12;
            minimumTax = 4700;
            minimumValue = 55000;
        } else if (giftValue >= 200000 && giftValue < 1000000) {
            taxRate = 15;
            minimumTax = 22100;
            minimumValue = 200000;
        } else if (giftValue >= 1000000) {
            taxRate = 17;
            minimumTax = 142100;
            minimumValue = 1000000;
        }
        double taxPayable = minimumTax + ((giftValue - minimumValue) * (taxRate / 100));

        if (taxRate > 0) {
            System.out.println("Tax: " + taxPayable);
        } else {
            System.out.println("No tax!");
        }
        reader.close();
    }

}
