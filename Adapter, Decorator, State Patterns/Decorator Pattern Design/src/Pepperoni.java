public class Pepperoni extends PizzaDecorator {

    public Pepperoni(PizzaInt decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public void makePizza() {
        decoratedPizza.makePizza();
        System.out.println("Add pepperoni");
    }
}
