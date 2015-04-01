import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 * Represents a Collection of Cards.
 * @author Jesse Fowler
 * @version 1.0
 */
public class Zone {

    private ArrayList<Card> cards = new ArrayList<Card>();

    /** Does Nothing
      */
    public Zone() {
    }

    /** Returns how many cards are in the Zone
      * @return The number of cards in the zone
      */
    public int countCard() {
        return this.cards.size();
    }

    /** Returns the number of scorable cards in the Collection
      * @return The number of scorable cards in the Collection
      */
    public int numGnomes() {
        int gnomeCount = 0;
        for (Card card: this.cards) {
            if (card.isScorable()) {
                gnomeCount++;
            }
        }
        return gnomeCount;
    }

    /** Adds a Card to the collection
      * @param card Card to be added
      */
    public void add(Card card) {
        this.cards.add(card);
    }

    /** Removes a specific card from the collection
      * @param card Card to be removed
      */
    public void remove(Card card) {
        this.cards.remove(card);
    }

    /** Removes the card at a specific position in the Collection
      * @param idx Index of card to be removed
      * @return The card that was removed
      */
    public Card remove(int idx) {
        Card c = this.get(idx);
        this.cards.remove(idx);
        return c;
    }

    /** Transfers all the cards in a collection to another collection
      * @param zone The collection the cards will transfer to
      */
    public void moveCardsTo(Zone zone) {
        for (Card card: this.cards) {
            zone.add(card);
        }
        this.cards.clear();
    }

    /** Returns how many cards are in the Zone
      * @return The number of cards in the zone
      */
    public int size() {
        return this.cards.size();
    }

    /** Returns the specific card at an Index
      * @param idx The Index of the card
      * @return The Card at that Index
      */
    public Card get(int idx) throws IndexOutOfBoundsException {
        return this.cards.get(idx);
    }

    /** Returns the entire collection of Cards
      * @return The entire collection of Cards
      */
    public ArrayList<Card> get() {
        return this.cards;
    }

    /** Randomizes the order of the Cards in the Collection
      */
    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(this.cards, new Random(seed));
    }

    /** Checks if the Collection contains a specific card
      * @param c The Card to check
      * @return Whether or not the Card is in the Collection
      */
    public boolean contains(Card c) {
        for (Card card: this.cards) {
            if (card.equals(c)) {
                return true;
            }
        }
        return false;
    }

    /** Gets rid of all the cards in the collection and returns the cards that
      * were removed
      * @return The set of cards that were removed
      */
    public ArrayList<Card> discardAll() {
        ArrayList<Card> played = new ArrayList<Card>();
        for (Card card: this.cards) {
            played.add(card);
        }
        this.cards.clear();
        return played;
    }

    /** Returns how many cards are in the Zone
      * @return The number of cards in the zone
      */
    public int getCardNumber() {
        return this.cards.size();
    }

    /** Returns The name, description, and cost of all the cards in the set
      * along with the number the card is in the set
      * @return The string representation of all the cards in the set
      */
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
