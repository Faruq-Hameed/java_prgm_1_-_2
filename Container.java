public class Container {
    private int first;
    private int second;

    public Container() {
        this.first = 0;
        this.second = 0;
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
        int newSecond = movableAmount;
        this.second = Math.min(newSecond, 100);
    }

    // remove from second
    public void remove(int amount) {
        if (this.second <= 0) {
            return;
        }
        this.second = this.second - Math.min(this.second, amount);
    }

    
}
