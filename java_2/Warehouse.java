import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;
    // private Set<String> products;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
        // this.products = new HashSet<>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        if (!prices.containsKey(product)) {
            return -99;
        }
        return prices.get(product);
    }

    public boolean take(String product) {
        int currentStock = this.stock(product);
        if (currentStock == 0) {
            return false;
        }
        stocks.put(product, (currentStock - 1));
        return true;
    }

    public int stock(String product) {
        if (!stocks.containsKey(product)) {
            return 0;
        }
        return stocks.get(product);
    }

    public Set<String> products() {
        return prices.keySet();
    }
}
