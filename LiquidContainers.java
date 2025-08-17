public class LiquidContainers {
    private int first;
    private int second;

    public LiquidContainers() {
        this.first = 0;
        this.second = 0;
    }

    public void add(int amount) {
        int newFirst = this.first + amount;
        if (newFirst <= 100) {
            this.first = newFirst;
        } else {
            this.first = 100;
        }
    }

    // method to move water from first to second
    public void move(int amount) {
        if(this.first ==0){
            return;
        }
        
        int newFirst = this.first - amount;
        int newSecond = this.second + amount;
        if (newFirst > 0) {
            this.first = 0;
        } else {
            this.first = newFirst;
        }
        if (newSecond <= 100) {
            this.second = newSecond;
        } else {
            this.second = 100;
        }
    }

    //remove from second
    public void remove(int amount) {
         if(this.second ==0){
            return;
        }
        int newSecond = this.second - amount;
        if (newSecond > 0) {
            this.second = 0;
        } else {
            this.second = newSecond;
        }
    }
}
