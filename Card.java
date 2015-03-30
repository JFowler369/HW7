public class Card {

    private String name;
    private String description;
    private Int keebleCost;

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public Int getKeebleCost() {
        return this.keebleCost;
    }

    public Boolean equals(Card c) {
        return c.getName().equals(this.getName());
    }

}
