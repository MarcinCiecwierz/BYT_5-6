package Builder;

public interface PizzaBuilder {
    void buildDough();

    void buildSauce();

    void buildCheese();

    void buildSalami();

    void buildMushroom();

    Pizza getPizza();
}