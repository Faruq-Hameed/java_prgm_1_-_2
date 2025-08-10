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
      int amountToAdd =  moveFromFirst(amount);
        if (this.second + amountToAdd <= 100) {
            this.second += amount;
        } else {
            this.second = 100;
        }
    }

    /** Adjust the first container to the given amount. and set to 0 if negative */
    public int moveFromFirst(int amount) {
        int newAmount = this.first - amount;
        if (newAmount > 0) {
            this.first = newAmount;
            return amount;
        } else {
            this.first = 0;
            return 100;
        }
    }

    public void remove(int amount){
        //if amount is lesser then remove
        if(this.second > amount){
            this.second -= amount;
        }
        else{ //else empty th second container
            this.second = 0;
        }
    }
    public static void main(String[] args) {
        LiquidContainers containers = new LiquidContainers();
    }
}