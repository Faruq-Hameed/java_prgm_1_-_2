package part_9;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        Item item = items.get(product);
        if (item == null) {
            item = new Item(product, 0, 0);
        }
        item.increaseQuantity();
        items.put(product, new Item(product, item.qty(), price));
    }

    public int price() {
        int totalPrice = 0;
        for (Item item : items.values()) {
            totalPrice += item.price();

        }
        return totalPrice;
    }

    public void print(){
        for (Item item : items.values()) {
           System.out.println(item);
            
        }
    }
}
