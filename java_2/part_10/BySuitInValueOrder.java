package part_10;
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    @Override
    /**
     * - First compare suits using getSuit().ordinal().
     * - If suits are equal, compare values using getValue().
     */
    public int compare(Card c1, Card c2) {
        int suitComparison = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        if (suitComparison != 0) {
            return suitComparison;
        } else {
            return c1.getValue() - c2.getValue();
        }
    }
}
