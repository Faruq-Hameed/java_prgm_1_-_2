package part_9;

public class StudentB implements Comparable<StudentB> {

    private String name;

    public StudentB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(StudentB other) {
        if (this.name.compareToIgnoreCase(other.name) == 0) {
            return 0;
        } else if (this.name.compareToIgnoreCase(other.name) < 0) {
            return -1;
        } else 
        return 1;
    }
}
