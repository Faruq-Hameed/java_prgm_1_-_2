
public class Student extends Person {

    private int studyCredit;

    public Student(String name, String address) {
        super(name, address);
        this.studyCredit = 0;
    }

    /**
     * Get the study credit
     */
    public int credits() {
        return this.studyCredit;
    }

    public void study() {
        this.studyCredit += 1;
    }

    @Override
    public String toString() {
        // Though override but still used it's used the superclass toString method
        // return super.name + "\n" + super.name + "\n " + this.credits();
        return (super.toString()) + "\n  credits " + this.credits();
    }
}
