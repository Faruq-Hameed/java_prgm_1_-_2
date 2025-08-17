public class LiquidContainers {
    private int first;
    private int second;

    public LiquidContainers() {
        this.first = 0;
        this.second = 0;
    }

    public void add(int amount) {
        int newFirst = first + amount;
        if (newFirst <= 100) {
            first = newFirst;
        } else {
            first = 100;
        }
    }

    // method to move water from first to second
    public void move(int amount) {
        int newFirst = first - amount;
        int newSecond = second + amount;
        if (newFirst > 0) {
            first = 0;
        } else {
            first = newFirst;
        }
        if (newSecond <= 100) {
            second = newSecond;
        } else {
            second = 100;
        }
    }

    //remove from second
    public void remove(int amount) {
        int newSecond = second - amount;
        if (newSecond > 0) {
            second = 0;
        } else {
            second = newSecond;
        }
    }
}
