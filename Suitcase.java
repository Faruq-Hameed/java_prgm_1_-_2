import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxHeight;

    public Suitcase(int weight) {
        this.items = new ArrayList<Item>();
        this.maxHeight = weight;
    }

    public void add(Item item) {
        int currentSuitWeight = 0; // create a variable to hold the current weight of the suitcase
        for (Item i : items) { 
            

        }// loop through the items in the suitcase
        this.items.add(item); //
    }

    // public boolean isEmpty() {
    //     return this.items.isEmpty(); // check if room is empty return true or false
    // }

    // public ArrayList<Item> getitems() { // return the list of items in the room
    //     return this.items;
    // }

    public String toString() {
        return this.items.size() + " items "+ "(" + this.maxHeight + " kg)";
    }
}
