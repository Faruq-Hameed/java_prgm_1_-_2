public class PaymentTerminal {
    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.00;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        double affordableMealsCost = 2.50;
        // increase the amount of cash by the price of an affordable meal and return the
        // change
        if (payment >= affordableMealsCost) {
            this.affordableMeals++;
            this.money = this.money + affordableMealsCost;
            return payment - affordableMealsCost;
        }
        // if the payment parameter is not large enough, no meal is sold and the method
        // should return the whole payment
        return payment;

    }

    public double eatHeartily(double payment) {
        double heartyMealsCost = 2.50;
        // increase the amount of cash by the price of an hearty meal and return the
        // change
        if (payment >= heartyMealsCost) {
            this.affordableMeals++;
            this.money = this.money + heartyMealsCost;
            return payment - heartyMealsCost;
        }
        // if the payment parameter is not large enough, no meal is sold and the method
        // should return the whole payment
        return payment;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}