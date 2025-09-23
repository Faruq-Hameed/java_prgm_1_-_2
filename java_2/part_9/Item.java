package part_9;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null || obj.getClass().getName() != this.getClass().getName()) {
            return false;
        }
        Item objItem = (Item) obj;
        if (obj.hashCode() == this.hashCode()) { //i,e true if name is equal
            return true;
        }
        return false;

    }

}
