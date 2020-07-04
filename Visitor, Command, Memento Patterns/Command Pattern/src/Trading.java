//Invoker class
import java.util.ArrayList;
import java.util.List;

public class Trading
{
    private List<Order> orders;

    public Trading()
    {
        orders = new ArrayList<Order>();
    }


    public void takeOrders(List<Order> list) // List<Order> list
    {
        for(Order o: list)
            orders.add(o);
    }

    public void executeOrders()
    {
        for (Order order: orders) {
            order.execute();
        }

        orders.clear();
    }
}

