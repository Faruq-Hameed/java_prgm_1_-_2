package part5;

public class PaymentTerminal {

    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.0;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        double affordableMealsCost = 2.5;
        // increase the amount of cash by the price of an affordable meal and return the
        // change
        if (payment >= affordableMealsCost) {
            this.money = this.money + affordableMealsCost;
            this.affordableMeals = this.affordableMeals + 1;
            return (payment - affordableMealsCost);
        }
        // if the payment parameter is not large enough, no meal is sold and the method
        // should return the whole payment
        return payment;

    }

    public boolean eatAffordably(PaymentCard card) {
        // try to takeout the affordableMeals cost from the card
        // an affordable meal costs 2.50 euros
        double affordableMealsCost = 2.5;
        // increase the amount of cash by the price of an affordable meal and return the
        // change if the payment card has enough money, the balance of the card is
        // decreased by
        // the price, and the method returns true
        if (card.takeMoney(affordableMealsCost)) {
            // this.money = this.money + affordableMealsCost;
            this.affordableMeals = this.affordableMeals + 1;
            return true;
        }
        // otherwise false is returned
        return false;
    }

    public double eatHeartily(double payment) {
        double heartyMealsCost = 4.3;
        // increase the amount of cash by the price of an hearty meal and return the
        // change
        if (payment >= heartyMealsCost) {
            this.money = this.money + heartyMealsCost;
            this.heartyMeals = this.heartyMeals + 1;

            // this.heartyMeals++;
            return (payment - heartyMealsCost);
        }
        // if the payment parameter is not large enough, no meal is sold and the method
        // should return the whole payment
        return payment;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        double heartyMealsCost = 4.3;
        // increase the amount of cash by the price of an hearty meal and return the
        // change
        if (card.balance() < heartyMealsCost) {
            return false;
        }
        // if the balance is greater than or equal to the price, the balance is
        // decreased by
        // the price, and the method returns true
        card.takeMoney(heartyMealsCost);
        // this.money = this.money + heartyMealsCost;
        this.heartyMeals = this.heartyMeals + 1;
        return true;

    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum < 0) {
            return;
        }
        card.addMoney(sum);
        this.money += sum;
    }

    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
