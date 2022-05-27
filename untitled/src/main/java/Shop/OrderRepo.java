package Shop;

import java.util.HashMap;
import java.util.List;

public class OrderRepo {

   private HashMap<String,Order> allMyOrders;

    public OrderRepo(HashMap<String, Order> allMyOrders) {
        this.allMyOrders = allMyOrders;
    }

    public void add(Order order) {
        allMyOrders.put(order.getOrderID(),order);

    }

    public Order get(String id) {
        return allMyOrders.get(id);

    }

    public List<Order>list() {
        return allMyOrders.values().stream().toList();
    }
}
