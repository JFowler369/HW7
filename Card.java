public class Card {

    private String name;
    private String description;
    private int keebleCost;
    private Boolean gnome;
    private String flavor;

    public Card(String name, String description, String flavor, Boolean gnome,
                int keebleCost) {
        this.name = name;
        this.description = description;
        this.flavor = flavor;
        this.gnome = gnome;
        this.keebleCost = keebleCost;
    }

    public void play(PlasterClash p) {
        Player player = p.currentPlayer();
        player.discardCard(this);
    }

    public void playToPlayZone(PlasterClash p) {
        p.getPlayZone().add(this);
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getCost() {
        return this.keebleCost;
    }

    public Boolean isScorable() {
        return this.gnome;
    }

    @Override
    public Boolean equals(Card c) {
        return c.getName().equals(this.getName());
    }

    public String toString() {
        String string = this.name + ": " + this.description + " Cost: "
                + this.keebleCost;
        return string;
    }

}
