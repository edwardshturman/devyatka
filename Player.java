public class Player {
    private String name;
    private Card[] cards;
    private int cardCount;

    public Player(String name) {
        this.name = name;
        cards = new Card[36];
        cardCount = 0;
    }

    public String name() {
        return name;
    }

    public int getCardCount() {
        return cardCount;
    }

    public void addCard(Card card) {
        cards[cardCount++] = card;
    }

    public Card playCard() {
        return cards[--cardCount];
    }

    public void print() {
        System.out.println(name + ":");
        for (int i = 0; i < cardCount; i++)
            System.out.println(cards[i]);
    }
}
