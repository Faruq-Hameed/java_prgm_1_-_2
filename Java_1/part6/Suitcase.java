/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxHeight;

    public Suitcase(int weight) {
        this.items = new ArrayList<Item>();
        this.maxHeight = weight;
    }

    public void addItem(Item item) {
        int suitWeight = this.totalWeight();
        // only add the new item if it weights wont make us to exceed max weight
        if (suitWeight + item.getWeight() <= this.maxHeight) {
            this.items.add(item); //
        }
    }

    public int totalWeight() {
        int suitWeight = 0; // create a variable to hold the current weight of the suitcase
        for (Item i : items) {
            suitWeight += i.getWeight();
        }
        return suitWeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public String toString() {
        int itemsSize = this.items.size();
        String response = itemsSize + " items (" + this.totalWeight() + " kg)";
        if (itemsSize == 0) {
            response = response.replaceFirst("0", "no"); // replace 0 with no
        }
        if (itemsSize == 1) {
            response = response.replace("items", "item");
        }
        return response;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviestItem = items.get(0);
        int heaviesItemWeight = heaviestItem.getWeight();

        for (Item item : items) {
            if (item.getWeight() > heaviesItemWeight) {
                heaviestItem = item;
                heaviesItemWeight = heaviestItem.getWeight();
            }
        }
        return heaviestItem;
    }
}