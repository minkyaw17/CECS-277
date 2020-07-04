import java.util.ArrayList;

public class CoinSet {
    ArrayList<Coin> Coins = new ArrayList<Coin>();

    /**
     * default constructor
     */
    public CoinSet() {

    }

    /**
     * adding a coin/currency to the Vending Machine
     * @param coin
     */
    public void addCoin(Coin coin) {
        Coins.add(coin);
    }

    /**
     * Getting the total amount put into the vending machine (- the change)
     * @return sum
     */
    public double getTotal() {
        double sum = 0;
        for (Coin c: Coins) {
            if ("Nickel".equals(c.getName())) {
                sum += 0.05;
            } else if ("Dime".equals(c.getName())) {
                sum += 0.1;
            } else if ("Quarter".equals(c.getName())) {
                sum += .25;
            } else if ("Dollar".equals(c.getName())) {
                sum += 1;
            }
        }
        return sum;
    }

    /**
     * Removinf the type of coin
     * @param Cointype
     * @return boolean
     */
    public boolean RemoveCoinType(String Cointype) {
        for (Coin c: Coins) {
            if (c.getName().equals(Cointype)) {
                Coins.remove(c);
                return true;
            }
        }
        return false;
    }

    /**
     * Removing the coins
     * @param quantity
     */
    public void removeCoin(double quantity) {
        while (quantity >= 0.05) {
            boolean toRemove = RemoveCoinType("Nickel");
            if (toRemove) {
                quantity -= 0.05;
            }
            else {
                break;
            }
        }

        while (quantity >= .1) {
            boolean toRemove = RemoveCoinType("Dime");
            if (toRemove) {
                quantity -= .1;
            }
            else {
                break;
            }
        }

        while (quantity >= .25) {
            boolean toRemove = RemoveCoinType("Quarter");
            if (toRemove) {
                quantity -= .25;
            }
            else {
                break;
            }
        }

        while (quantity >= 1) {
            boolean toRemove = RemoveCoinType("Dollar");
            if (toRemove) {
                quantity -= 1;
            } else {
                break;
            }
        }
    }

    /**
     * Emptying the coins
     */
    public void emptyCoins() {
        Coins.clear();
    }

    /**
     * Getting temp value to use in the vending machine program
     * @return
     */
    public double getTemp() {
        double sum = 0;
        for (Coin c: Coins) {
            if ("Nickel".equals(c.getName())) {
                sum += 0.05;
            } else if ("Dime".equals(c.getName())) {
                sum += 0.1;
            } else if ("Quarter".equals(c.getName())) {
                sum += .25;
            } else if ("Dollar".equals(c.getName())) {
                sum += 1;
            }
        }
        return sum;
    }
}
