
public class Container {

    private int first;

    public Container() {
        this.first = 0;
    }

    public void add(int amount) {
        // do nothing for -ve amount and zero
        if (amount <= 0) {
            return;
        }
        int newFirst = this.first + amount;
        // set the new value of first to newFirst or 100max
        this.first = Math.min(newFirst, 100);
    }

    // method to move water from first to second
    public void move(int amount) {
        if (this.first <= 0) {
            return;
        }
        int movableAmount = Math.min(this.first, amount); // only remove what is available if less than amount
        this.first = this.first - movableAmount; // this cannot be -ve again
    }

    // remove from second
    public void remove(int amount) {
        if (this.first <= 0) {
            return;
        }
        this.first = this.first - Math.min(this.first, amount);
    }

    public int contains() {
        return this.first;
    }

    @Override
    public String toString() {
        return this.first + "/100";
    }
}
