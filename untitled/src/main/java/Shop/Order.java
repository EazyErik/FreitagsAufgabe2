package Shop;

import java.util.UUID;

public class Order {


    private String orderID;
    private Product product;

    public Order(Product product) {
        this.orderID = UUID.randomUUID().toString();
        this.product = product;
    }

    public String getOrderID() {
        return orderID;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return product.getName();
    }
}
