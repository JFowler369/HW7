/**
 * Represents a Basic card.
 * @author Jesse Fowler
 * @version 1.0
 */
public class Card {

    private String name;
    private String description;
    private int keebleCost;
    private Boolean gnome;
    private String flavor;

    /**
     * Constructs a Card object.
     * @param name Name of the Card
     * @param description Description of card
     * @param flavor Flavor Text for card
     * @param gnome Whether or not the card is worth points (is a gnome)
     * @param keebleCost Amount of keebles required to buy card in field
     */
    public Card(String name, String description, String flavor, Boolean gnome,
                int keebleCost) {
        this.name = name;
        this.description = description;
        this.flavor = flavor;
        this.gnome = gnome;
        this.keebleCost = keebleCost;
    }

    /** Removes the card from the hand of the player
      * @param p The PlasterClash game calling the function
      */
    public void play(PlasterClash p) {
        Player player = p.currentPlayer();
        player.getHand().remove(this);
    }

    /** Adds the card to the playzone
      * @param p The PlasterClash game calling the Function
      */
    public void playToPlayZone(PlasterClash p) {
        p.getPlayZone().add(this);
    }

    /** Returns the name of the card
      * @return The name of the card
      */
    public String getName() {
        return this.name;
    }

    /** Returns the descriptioni of the card
      * @return The description of the card
      */
    public String getDescription() {
        return this.description;
    }

    /** Returns the cost of the card
      * @return The cost of the card
      */
    public int getCost() {
        return this.keebleCost;
    }

    /** Returns Whether or not the card is a gnome
      * @return If the card is a gnome or not
      */
    public Boolean isScorable() {
        return this.gnome;
    }

    /** Returns if two cards have the same name
      * @param c The Card that is compared to the card called
      * @return If two cards have the same name
      */
    public Boolean equals(Card c) {
        return c.getName().equals(this.getName());
    }

    /** Returns the name, description, and cost of the card
      * @return The name, description, and cost of the card
      */
    public String toString() {
        String string = this.name + ": " + this.description + " Cost: "
                + this.keebleCost;
        return string;
    }

}
