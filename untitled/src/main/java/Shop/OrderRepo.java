package Shop;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class OrderRepo {

    private HashMap<String, Order> allMyOrders = new HashMap<>();


    void addOrder(List<Product> listOfProducts) {
     for (Product product : listOfProducts) {
         allMyOrders.put(product.getId(),new Order(product));
     }


    }

    Optional<Order> get(String id) {
        return Optional.ofNullable(allMyOrders.get(id));

    }

    List<Order> list() {
        return allMyOrders.values().stream().toList();
    }
}
