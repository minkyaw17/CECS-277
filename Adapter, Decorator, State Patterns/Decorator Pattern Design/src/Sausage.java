public class Sausage extends PizzaDecorator{

    public Sausage(PizzaInt decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public void makePizza() {
        decoratedPizza.makePizza();
        System.out.println("Add sausage");
    }
}
