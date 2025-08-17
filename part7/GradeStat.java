package part7;
import java.util.ArrayList;

public class GradeStat {
    private ArrayList<Integer> grades;
    private int number;
    private int count;

    public GradeStat() {
        this.number = 0;
        this.count = 0;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grades.add(grade);
        }
    }

    public void add(int num){
        if(num >= 0 && num <= 100) {
            this.number += num;
            this.count++;
        }
    }

}