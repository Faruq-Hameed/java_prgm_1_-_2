import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 6, -8, 16, 26, 0, 18, 2, -0, 55, -19 };
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-19);
        list.add(55);
        list.add(2);
        list.add(18);
        list.add(0);
        list.add(26);
        list.add(16);
        list.add(-8);
        list.add(6);
        // list.add(0, 100); // adding at index 0
        System.out.println(list.toString());
        System.out.println("------------------");

        sortIntegers(list);
        System.out.println(list.toString());
        // sortIntegers(list);
        System.out.println("------------------");

        // Arrays.sort(arr);

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);

    }

    public static void sortIntegers(ArrayList<Integer> integers) {

        int[] arr = new int[integers.size()];
        // copy the list into array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = integers.get(i);
        }
        // sort the arr
        Arrays.sort(arr);

        // reconstruct the list with the sorted array
        for (int i = 0; i < arr.length; i++) {
            integers.set(i, arr[i]);
        }

    }

    public static void sortStrings(ArrayList<String> strings) {
        String[] arr = new String[strings.size()];
        // copy the list into array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = strings.get(i);
        }
        // sort the arr
        Arrays.sort(arr);
        // reconstruct the list with the sorted array
        for (int i = 0; i < arr.length; i++) {
            strings.set(i, arr[i]);
        }
    }

}
