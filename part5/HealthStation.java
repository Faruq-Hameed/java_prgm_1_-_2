package part5;

public class HealthStation {

    private int weighingsCounter;

    public HealthStation() {
        this.weighingsCounter = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weighingsCounter = this.weighingsCounter + 1;
        return person.getWeight();
        // return -1;
    }

    public void feed(Person person) {
        // person.w()
        person.setWeight(this.weigh(person) + 1);
    }

    public int weighings() {
        return this.weighingsCounter;
    }

}
