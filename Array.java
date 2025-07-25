import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some integers to the ArrayList
    //    numbers.add(10.0);
    boolean status = (boolean) false;
    System.out.println("Status of adding 10: " + status);
    ArrayList<String> wordList = new ArrayList<>();

        wordList.add("First");
        wordList.add("Second");

        System.out.println(wordList.get(1));
        System.out.println(wordList);
        // System.out.println(wordList.get(-1)); // This will throw an IndexOutOfBoundsException
        ArrayList<Boolean> boolList = new ArrayList<>();
        System.out.println(boolList.size());
        // Attempt to add a double value to the ArrayList
    }

}
