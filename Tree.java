/**
 * Represents The Player Deck.
 * @author Jesse Fowler
 * @version 1.0
 */
public class Tree extends Zone {

    /** Creates a Tree Zone that acts as the players deck to draw from
      * Starts with 9 Keeble and 1 Gnome
      */
    public Tree() {

        this.get().clear();

        Keeble k1 = new Keeble();
        this.get().add(k1);

        Keeble k2 = new Keeble();
        this.get().add(k2);

        Keeble k3 = new Keeble();
        this.get().add(k3);

        Keeble k4 = new Keeble();
        this.get().add(k4);

        Keeble k5 = new Keeble();
        this.get().add(k5);

        Keeble k6 = new Keeble();
        this.get().add(k6);

        Keeble k7 = new Keeble();
        this.get().add(k7);

        Keeble k8 = new Keeble();
        this.get().add(k8);

        Keeble k9 = new Keeble();
        this.get().add(k9);

        Gnome g1 = new Gnome();
        this.get().add(g1);
    }

}
