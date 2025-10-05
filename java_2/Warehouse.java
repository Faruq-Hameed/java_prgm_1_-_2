import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<String, Product> products;

    public Warehouse() {
        this.products = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        Product newProduct = new Product(price, stock);

        products.put(product, newProduct);
    }

    public int price(String product) {
        Product foundProduct = products.get(product);
        if (foundProduct == null) {
            return -99;
        }
        return foundProduct.getPrice();
    }

    public int stock(String product) {
        Product foundProduct = products.get(product);

        if (foundProduct == null) {
            return -99;
        }
        return foundProduct.getPrice();
    }

    private void instantiateProduct() {
        if (this.products == null) {
            this.products = new HashMap<>();
        }
    }
}
