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
}
