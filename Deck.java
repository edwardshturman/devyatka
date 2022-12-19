public class Deck {
    private Card[] cards;
    private int size;

    public Deck() {
        cards = new Card[36];
        size = 0;
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits)
            for (String rank : ranks)
                cards[size++] = new Card(rank, suit);
    }

    public void shuffle() {
        for (int i = 0; i < size; i++) {
            int j = i + (int) (Math.random() * (size - i));
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public Card deal() {
        return cards[--size];
    }

    public int size() {
        return size;
    }

    public void print() {
        for (int i = 0; i < size; i++)
            System.out.println(cards[i]);
    }
}
