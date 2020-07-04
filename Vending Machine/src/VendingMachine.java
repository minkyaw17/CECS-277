import java.util.ArrayList;

public class VendingMachine {
    ArrayList<Product> Products = new ArrayList<Product>();
    CoinSet myCoinSet = new CoinSet();

    /**
     * default constructor
     */
    public VendingMachine() {

    }

    /**
     * adding product to the Vending Machine
     * @param Product
     */
    public void addProduct(Product Product) {
        Products.add(Product);
    }

}
