package part_9;
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<Item>();
    }

    @Override
    public void add(Item item) { //only add item if it wont increase the weight
//        int currentWeight = this.currentBoxWeight();
        if (this.currentBoxWeight() +item.getWeight() <= this.capacity) {
            items.add(item);
        }
    }

    public int currentBoxWeight() {
        int weight = 0;
        for (Item item : items) {
            weight += item.getWeight();
        }
        return weight;
    }

    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
    public void printItems (){
        System.out.println(this.items);}
}
