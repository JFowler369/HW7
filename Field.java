import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
/**
 * Represents The Card Shop.
 * @author Jesse Fowler
 * @version 1.0
 */
public class Field {

    private static Map<Card, Integer> cards = new HashMap<Card, Integer>();

    /** Makes a Shop with preset cards
      */
    public Field() {
        Gnome g1 = new Gnome();
        GardenBread gb1 = new GardenBread();
        CrazyGnome cg1 = new CrazyGnome();
        GardenParty gp1 = new GardenParty();
        this.cards = new HashMap<Card, Integer>();
        this.cards.put(g1, 20);
        this.cards.put(gb1, 100);
        this.cards.put(cg1, 5);
        this.cards.put(gp1, 3);
    }

    /** Returns the Cards available for purchase
      * @return Cards available for purchase
      */
    public ArrayList<Card> cards() {
        ArrayList<Card> availableCards = new ArrayList<Card>();
        for (Card card: this.cards.keySet()) {
            availableCards.add(card);
        }
        return availableCards;
    }

    /** If the card is available reduces the amount left by 1
      * if 0 left removes the card from the map
      * @param c The card to be bought
      */
    public void buyCard(Card c) {
        if (this.cards.containsKey(c)) {
            int remaining = this.cards.get(c) - 1;
            this.cards.remove(c);
            if (remaining != 0) {
                this.cards.put(c, remaining);
            }
        }
    }

}
