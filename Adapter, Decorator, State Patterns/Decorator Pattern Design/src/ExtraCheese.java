public class ExtraCheese extends PizzaDecorator {

    public ExtraCheese(PizzaInt decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public void makePizza() {
        decoratedPizza.makePizza();
        System.out.println("Add extra cheese");
    }
}
