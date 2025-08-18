import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int currentHoldWeight = this.totalWeight();
        if (currentHoldWeight + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int currentHoldWeight = 0;
        for (Suitcase s : suitcases) {
            currentHoldWeight += s.totalWeight();
        }
        return currentHoldWeight;
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + "<" +this.totalWeight() +">" + " kg)";
    }

    public void printItems() {
        for (Suitcase s : suitcases) {
            s.printItems();
        }
    }

}
