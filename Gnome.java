import java.util.ArrayList;

public class Gnome extends Card {

    public Gnome() {
      super("Gnome",
          "Add 1 to the player Score and causes all other players to discard.",
              "A fun-loving keeble out to bake some cookies.",
              true, 7);
    }

    @Override
    public void play(PlasterClash p) {
        ArrayList<Player> opponents = p.opponents();
        for (Player opponent: opponents) {
            opponent.discardRandom();
        }
        p.currentPlayer().getHand().remove(this);
    }

}
