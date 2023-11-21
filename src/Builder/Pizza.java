package Builder;

public class Pizza {
    private String dough;
    private String sauce;
    private String cheese;
    private String salami = "without";
    private String mushroom = "without";

    public Pizza() {

    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setSalami(String salami) {
        this.salami = salami;
    }

    public void setMushroom(String mushroom) {
        this.mushroom = mushroom;
    }

    @Override
    public String toString() {
        return "Pizza with " + dough + " dough, " + sauce + " sauce, " + cheese + " cheese, " + salami + " salami, " + mushroom + " mushroom";
    }
}
