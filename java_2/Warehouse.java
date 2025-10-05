import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
    }

    public int price(String product) {
        if (!prices.containsKey(product)) {
            return -99;
        }
        return prices.get(product);
    }

}
