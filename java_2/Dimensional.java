import java.util.Arrays;

public class Dimensional {

    public static void main(String[] args) {
        int row = 5;
        int column = 3;

        int[][] students = new int[row][column];
        // System.out.println(students);
        for (int[] student : students) {
            System.out.println(Arrays.deepToString(students));
        }
    }
}
