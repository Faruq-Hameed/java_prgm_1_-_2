package part_9;
public class Product {
    // private String name;
    private int price;
    private int stock;

    public Product(int price, int stock) {
        // this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

}
