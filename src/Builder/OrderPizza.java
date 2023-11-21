package Builder;

public class OrderPizza {
    public static void main(String[] args) {
        Client client = new Client();

        PizzaBuilder margherita = new MargheritaPizzaBuilder();

        client.setPizzaBuilder(margherita);
        client.constructPizza();

        Pizza margheritaPizza = client.getPizza();
        System.out.println(margheritaPizza);
    }
}
