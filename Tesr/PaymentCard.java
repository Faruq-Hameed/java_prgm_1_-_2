package Tesr;

public class PaymentCard {
    private double balance;

    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }

    public void eatAffordably() {
        this.balance -= 2.60;
    }

    public void eatHeartily() {
        this.balance -= 4.60;
    }

    public void addMoney(double amount) {
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
