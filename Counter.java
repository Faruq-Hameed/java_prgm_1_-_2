public class Counter {
    private int number;

    public Counter(int startValue) {
        this.number = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.number;
    }

    public void increase() {
        this.number = this.number + 1;
    }

    public void decrease() {
        this.number = this.number - 1;
    }

    public void increase(int increaseBy) {
        this.number = this.number + increaseBy;

    }

    public void decrease(int decreaseBy) {
        this.number = this.number + decreaseBy;

    }
}
