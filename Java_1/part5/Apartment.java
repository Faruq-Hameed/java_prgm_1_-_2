package part5;
public class Apartment {
    private int room;
    private int squares;
    private int pricePerSquare;

    public Apartment(int room, int squares, int pricePerSquare) {
        this.room = room;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    // calculate absolute value of differences
    public int priceDifference(Apartment compared) {
        int currentAptPrice = this.pricePerSquare * this.squares;
        int comparedAptPrice = compared.pricePerSquare * compared.squares;
        System.out.println("currentAptPrice: " + currentAptPrice + " comparedAptPrice: " + comparedAptPrice + " diff: "
                + (currentAptPrice - comparedAptPrice));
        return (Math.abs(currentAptPrice - comparedAptPrice));

    }

    public boolean isApartmentEqual(Object compare) {
        // first check if address are equal to each other
        if (this !=compare) {
            return false;
        }
        if (!(compare instanceof Apartment)) {
            return false;
        }
        //type cast the object and then inspect the variables for equality
        Apartment compareApartment = (Apartment) compare;
        // check if pricePerSquare and room are equal to each other
        if (this.pricePerSquare == compareApartment.pricePerSquare && this.room == compareApartment.room
                && this.squares == compareApartment.squares) {
            return true;
        }
        //else false
        return false;
    }
}
