public class CrazyGnome extends Card {

    public CrazyGnome() {
        super("Crazy Gnome",
              "Add 1 to the player Score"
              + "or use to release the Crazy Gnome back to the population"
              + "to decrease suspicion.",
              "A traumatized Gnome, in the attempt to warn his fellow Gnomes"
              + " he actually makes the threat seem ridiculous.",
              true, 9);
    }

    @Override
    public void play(PlasterClash p) {
        p.addGnomeCount(-1);
        p.currentPlayer().getHand().remove(this);
    }


}
