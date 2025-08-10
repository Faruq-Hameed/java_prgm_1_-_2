
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = { 3, 1, -9, 0, -18, 5, 99, 3, -7, 12 };
        int smallestNum = smallest(array);
        System.out.println("smallets is : " + smallestNum);
        int smallestNumIndex = indexOfSmallest(array);
        System.out.println("smallets is index: " + smallestNumIndex);

        int smallestNumIndexFrom = indexOfSmallestFrom(array, 5);
        System.out.println("smallets is index from: " + smallestNumIndexFrom);

        swap(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        int smallest = table[startIndex];

        for (int i = startIndex; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int valueAtIndex1 = array[index1];
        int valueAtIndex2 = array[index2];
        array[index1] = valueAtIndex2;
        array[index2] = valueAtIndex1;

    }

    public static void sort(int[] table) {
        for (int i = 0; i < table.length; i++) {
            // starting from i, get the index of smaller number
            int smallextIndex = indexOfSmallestFrom(table, i);
            // swap the value of index i with value at smallest index
            swap(table, i, smallextIndex);
        }
    }

}
