public class LiquidContainers {
    private int first;
    private int second;

    public LiquidContainers() {
        this.first = 0;
        this.second = 0;
    }

    public void add(int amount) {
        if (this.first + amount <= 100)
            this.first = 100;
    }

    public void move(int amount) {
        setFirst(amount);
        if (this.second + amount <= 100) {
            this.second += amount;
        } else {
            this.second = 100;
        }
    }

    /** Adjust the first container to the given amount. and set to 0 if negative */
    public void setFirst(int amount) {
        int newAmount = this.first - amount;
        if (newAmount > 0) {
            this.first = newAmount;
        } else {
            this.first = 0;
        }
    }
}