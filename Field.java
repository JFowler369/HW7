import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Field {

    private static Map<Card, Integer> cards = new HashMap<Card, Integer>();

    public Field() {
        Gnome g1 = new Gnome();
        GardenBread gb1 = new GardenBread();
        CrazyGnome cg1 = new CrazyGnome();
        this.cards = new HashMap<Card, Integer>();
        this.cards.put(g1, 20);
        this.cards.put(gb1, 100);
        this.cards.put(cg1, 5);
    }

    public ArrayList<Card> cards() {
        ArrayList<Card> availableCards = new ArrayList<Card>();
        for (Card card: this.cards.keySet()) {
            availableCards.add(card);
        }
        return availableCards;
    }

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
