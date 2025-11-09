
public class PersonE {

    private String name;
    private Education education;

    public PersonE(String name, Education education) {
        this.name = name;
        this.education = education;
    }

    public Education getEducation() {
        return education;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
//    Anna, PHD
        return this.name + ", " + this.education;

    }
}
