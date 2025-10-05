public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.unitPrice * this.qty;
    }

    public int qty() {
        return this.qty;
    }

    public void increaseQuantity() {
        this.qty += 1;
    }

    @Override
    public String toString() {
        return product + ": " + qty;
    }

    public static void main(String[] args) {
        Item item = new Item("food", 0, 0);
        Item itemB = item;
        item = new Item("rice", 10, 0);

        System.out.println(itemB);
    }

}
