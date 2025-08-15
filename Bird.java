public class Bird {
    private String name;
    private String latinName;
    private int observation;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }
    
    public void observe() {
        this.observation++;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int getObservation() {
        return this.observation;
    }

    public boolean isEqualTo(Bird other) {
        if(this == other){
            return true;
        }
        if(other == null){
            return false;
        }
        return this.name.equals(other.name) && this.latinName.equals(other.latinName) && this.observation == other.observation;
    }
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observation + " observations";
    }
}
