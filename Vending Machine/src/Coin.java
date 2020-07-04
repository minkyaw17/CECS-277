public class Coin {
    private String name;
    private double value;

    /**
     * default constructor
     */
    public Coin() {
        name = " ";
        value = 0.0;
    }

    /**
     * Second constructor with parameters
     * @param aName
     * @param aValue
     */
    public Coin(String aName, double aValue) {
        this.name = aName;
        this.value = aValue;
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
     * Setter for value
     * @param value
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * getter for value
     * @return value
     */
    public double getValue() {
        return value;
    }
}

