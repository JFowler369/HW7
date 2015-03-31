import java.util.ArrayList;

public class Zone {

    private ArrayList<Card> cards = new ArrayList<Card>();

    public Zone() {

    }

    public int countCard() {
        return cards.size();
    }

    public int numGnomes() {
        int gnomeCount = 0;
        for (Card card: this.cards) {
            if (card.isScorable()) {
                gnomeCount++;
            }
        }
        return gnomeCount;
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void remove(Card card) {
        this.cards.remove(card);
    }

    public Card remove(int idx) {
        Card c = this.get(idx);
        this.cards.remove(idx);
        return c;
    }

    public void moveCardsTo(Zone zone) {
        for (Card card: this.cards) {
            zone.add(card);
        }
        this.cards = new ArrayList<Card>();
    }

    public int size() {
        return this.cards.size();
    }

    public Card get(int idx) {
        if (this.cards.size() >= idx) {
            return this.cards.get(idx);
        }
        return null;
    }

    public ArrayList<Card> get() {
        return this.cards;
    }

    public void shuffle() {

    }

    public boolean contains(Card c) {
        for (Card card: this.cards) {
            if (card.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Card> discardAll() {
        return this.cards;
    }

    public int getCardNumber() {
        return this.cards.size();
    }

    public String toString() {
        String string = "";
        int count = 0;
        for (Card card: this.cards) {
            string += count;
            string += ": ";
            count++;
            string += card.toString() + "\n";
        }
        return string;
    }

}
