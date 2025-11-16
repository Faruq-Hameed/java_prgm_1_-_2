package flight;

public class Airplane {
    private String Id;
    private int capacity;

    public Airplane(String Id, int capacity) {
        this.Id = Id;
        this.capacity = capacity;
    }
    public String getId() {
        return Id;
    }
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return Id + " (" + capacity + " capacity)";
    }
}
