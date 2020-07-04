public class Product {
    private String name;
    private  double price;
    private int quantity;

    /**
     * Default Constructor
     */
    public Product() {
        name = "";
        price = 0.0;
        quantity = 0;
    }

    /**
     * Second constructor with parameters
     * @param Name
     * @param Price
     * @param Quantity
     */
    public Product(String Name, double Price, int Quantity) {
        this.name = Name;
        this.price = Price;
        this.quantity = Quantity;
    }

    /**
     * Setter for name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for price
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * getter for Price
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter for quantity
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for quantity
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Decrementer of product to use in the vending machine program
     */
    public void decrement() {
        setQuantity(getQuantity() - 1);
    }
}
