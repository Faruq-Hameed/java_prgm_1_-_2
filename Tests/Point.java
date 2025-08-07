package Tests;

import java.util.ArrayList;

public class Point {
    private ArrayList<Integer> points;
    private Star star;
    private final int[] calculatedGrades = new int[6]; // 0-5 grades

    public Point() {
        this.points = new ArrayList<>();
        this.star = new Star();
    }

    public void addPoint(Integer point) {
        //  if (point == null) {
        //     calculatePoints();
        // } else
        if (point < 0 || point > 100) {
            System.out.println("Impossible number.");
        } else {
            points.add(point);
        }
        return;
    }

    private void calculatePoints() {
        System.out.println("Calculating points...");
        int fiveGrade = 0;
        int fourGrade = 0;
        int threeGrade = 0;
        int twoGrade = 0;
        int oneGrade = 0;
        int zeroGrade = 0;

        for (Integer point : points) {
            // No point can be less than 0 or greater than 100
            if (point >= 90) {
                fiveGrade++;
            } else if (point >= 80) {
                fourGrade++;
            } else if (point >= 70) {
                threeGrade++;
            } else if (point >= 60) {
                twoGrade++;
            } else if (point >= 50) {
                oneGrade++;
            } else {
                zeroGrade++;
            }

        }
        calculatedGrades[5] = fiveGrade;
        calculatedGrades[4] = fourGrade;
        calculatedGrades[3] = threeGrade;
        calculatedGrades[2] = twoGrade;
        calculatedGrades[1] = oneGrade;
        calculatedGrades[0] = zeroGrade;
        System.out.println("Points calculated.");
    }

    // Method to print the stars for each grade with the grade number
    public void printGrades() {
        System.out.println("Now printing the stars for each grade:");
        calculatePoints();
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            // System.out.println("calculatedGrades[i] : " + calculatedGrades[i]);
            star.print(calculatedGrades[i]);
            System.out.println();
        }

    }

}
