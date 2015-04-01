/**
 * Represents a GardenParty card.
 * @author Jesse Fowler
 * @version 1.0
 */
public class CrazyGnome extends Card {

    /** Creates a Crazy Gnome card that is scorable and reduces the
      * Conspiracy meter by 2 when used
      */
    public CrazyGnome() {
        super("Garden Party",
              "Discrete way to capture Gnomes without arousing suspicion",
              "An extravagant party meant to distract the Gnomes",
              false, 10);
    }

    /** Reduces the Conspiracy meter by 2 and removes the gnome from play
      * @param p The PlasterClash game calling the function
      */
    @Override
    public void play(PlasterClash p) {
        p.currentPlayer().getHand().add(new Gnome());
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("| Gnome Captured! Conspiracy meter unchanged |");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>");
        p.currentPlayer().getHand().remove(this);
    }


}
