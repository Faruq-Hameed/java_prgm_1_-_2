
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    
    private List<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
    
    public void sort() {
//        cards.sort(c);
        Collections.sort(cards);
        this.print();
    }
    
    @Override
    public int compareTo(Hand other) {
        return this.getCardSum() - other.getCardSum();
    }

    /* get sum using the card values**/
    public int getCardSum() {
        int sum = this.cards.stream()
                .map(card -> card.getValue())
                .mapToInt(value -> value)
                .sum();
        return sum;
        
    }
    
    public void sortBySuit() {
        cards.sort(new BySuitInValueOrder());
    }
}
