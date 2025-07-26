import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int[] array;
        // array[0] =1; // not possible

        array = new int[5]; // specify the size of the array
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        // array[7] = 50; //Index 7 out of bounds for length 5
        String result = Arrays.toString(array);
        System.out.println(result);

        String[] strArray = new String[5];
        strArray[0] = "Hello";
        strArray[1] = "World";
        strArray[2] = "Java";
        strArray[3] = "Program";
        strArray[4] = "Tutorial";
        System.out.println(strArray[3]);
        ArrayList<String> strArray1 = new ArrayList<String>();
        System.out.println("strArray.length : " + strArray.length);
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        int counter = 0;
        while(counter < 3){

        }


      
    }
}