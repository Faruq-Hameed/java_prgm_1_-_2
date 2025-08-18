package part5;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros) {
            return false;
        }
        if (this.euros <= compared.euros && this.cents <= compared.euros) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int euro = this.euros - decreaser.euros;
        int cent = this.cents - decreaser.cents;

        // setting any negative values to 0
        if (euro < 0) {
            euro = 0;
        }
        if (cent < 0) {
            cent = 0;
        }

        Money newMoney = new Money(euro, cent);

        return newMoney;
    }
}
