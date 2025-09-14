
public class Student extends Person {

    private int studyCredit;
    private String name;

    public Student(String name, String address) {
        super(name, address);
        this.studyCredit = 0;
        this.name = name;
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
        return (super.toString()) + "\n  credit " + this.credits();
    }

    public int getStudyCredit() {
        return studyCredit;
    }

    public void setStudyCredit(int studyCredit) {
        this.studyCredit = studyCredit;
    }

    // public String getName() {
    //     // return name;
    //     return "name from student is : " + name;
    // }

    public void setName(String name) {
        this.name = name;
    }
}
