//Client
import java.util.ArrayList;
import java.util.List;

public class CommandPatternDemo
{
    public static void main(String[] args)
    {
        Stock s1 = new Stock("Microsoft", 170.00);
        Stock s2 = new Stock("Apple", 200.00);
        Stock s3 = new Stock("Amazon", 1800);

        Trading d = new Trading();

        // Buy orders
        Order o1 = new BuyStock(s1, 4);
        Order o2 = new BuyStock(s2, 2);

        // Sell orders
        Order o3 = new SellStock(s3, 3);

        // Add these orders to a list
        List<Order> orders = new ArrayList<Order>();
        //YOUR CODE

        orders.add(o1);
        orders.add(o2);
        orders.add(o3);

        //Take the orders

        d.takeOrders(orders);

        //Execute the order

        d.executeOrders();

    }
}
