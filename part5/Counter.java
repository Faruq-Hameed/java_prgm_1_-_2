package part5;
public class Counter {
    private int number;
    private int age;


    public Counter(int startValue) {
        this.number = startValue;
        this.age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
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
