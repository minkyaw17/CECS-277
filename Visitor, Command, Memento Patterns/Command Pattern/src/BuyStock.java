//Concrete command buying stock class
public class BuyStock implements Order {
    private Stock s;
    int quantity;

    public BuyStock(Stock s, int quantity)
    {
        super();
        this.s = s;
        this.quantity = quantity;
    }

    public void execute()
    {
        s.buy(quantity);
    }
}
