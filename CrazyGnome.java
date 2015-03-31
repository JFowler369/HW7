/**
 * Represents a CrazyGnome card.
 * @author Jesse Fowler
 * @version 1.0
 */
public class CrazyGnome extends Card {

    /** Creates a Crazy Gnome card that is scorable and reduces the
      * Conspiracy meter by 2 when used
      */
    public CrazyGnome() {
        super("Crazy Gnome",
              "Add 1 to the player Score"
              + "or use to release the Crazy Gnome back to the population"
              + "to decrease suspicion.",
              "A traumatized Gnome, in the attempt to warn his fellow Gnomes"
              + " actually makes the threat seem ridiculous.",
              true, 9);
    }

    /** Reduces the Conspiracy meter by 2 and removes the gnome from play
      * @param p The PlasterClash game calling the function
      */
    @Override
    public void play(PlasterClash p) {
        p.addGnomeCount(-2);
        p.currentPlayer().getHand().remove(this);
    }


}
