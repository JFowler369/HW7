/**
 * Represents a GardenParty card.
 * @author Jesse Fowler
 * @version 1.0
 */
public class GardenParty extends Card {

    /** Creates a Garden Party card that isn't scorable and adds a gnome without
      * increasing Conspiracy meter when used
      */
    public GardenParty() {
        super("Garden Party",
              "Discrete way to capture Gnomes without arousing suspicion",
              "An extravagant party meant to distract the Gnomes",
              false, 10);
    }

    /** Adds a Gnome to the player hand without increasing Meter
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
