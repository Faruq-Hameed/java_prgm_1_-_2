import java.util.Arrays;

public class Example{
    public static void main (String [] args){
        int[] array;
        // array[0] =1; // not possible

        array = new int[5]; //specify the size of the array
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        // array[7] = 50; //Index 7 out of bounds for length 5
       String result = Arrays.toString(array);
       System.out.println(result);
    }
}