import java.util.ArrayList;
/**
 * Represents a Gnome card.
 * @author Jesse Fowler
 * @version 1.0
 */
public class Gnome extends Card {

    /** Creates a Gnome card that is scorable and makes opponents discard when
      * used
      */
    public Gnome() {
      super("Gnome",
            "Add 1 to the player Score"
            + "or use to cause all other players to discard a random card.",
            "A fun-loving keeble out to bake some cookies.",
            true, 7);
    }

    /** Makes opponents discard and removes card from play
      * @param p The PlasterClash game that called the function
      */
    @Override
    public void play(PlasterClash p) {
        ArrayList<Player> opponents = p.opponents();
        for (Player opponent: opponents) {
            opponent.discardRandom();
        }
        p.currentPlayer().getHand().remove(this);
    }

}
