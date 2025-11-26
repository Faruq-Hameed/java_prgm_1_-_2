import java.util.Arrays;

public class Dimensional {

    public static void main(String[] args) {
        int row = 5;
        int column = 3;

        int[][] students = new int[row][column];
        // System.out.println(students);
        // for (int[] student : students) {
        // System.out.println(Arrays.deepToString(students));
        // }
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int[][] array) {
        String result = "";

        for (int row = 0; row < array.length; row++) {
            String localResult = "";

            for (int column = 0; column < array[row].length; column++) {
                int value = array[row][column];
                localResult += "" + value;
            }
            result += localResult;
            if (row < array.length) {
                result += "\n";
            }
        }
        return result;
    }
}
