public class Card {
    private String suit;
    private String rank;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String suit() {
        return suit;
    }

    public String rank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
