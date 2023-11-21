package Builder;

public class CapriPizzaBuilder implements PizzaBuilder{

    private Pizza pizza;

    public CapriPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("Thin crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Tomato sauce");
    }

    @Override
    public void buildCheese() {
        pizza.setCheese("Mozzarella");
    }

    @Override
    public void buildSalami() {

    }

    @Override
    public void buildMushroom() {
        pizza.setMushroom("Mushroom");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
