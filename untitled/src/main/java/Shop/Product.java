package Shop;

import java.util.UUID;

public class Product {

    private String name;
    private String productID;

    public Product(String name) {
        this.name = name;
        this.productID = UUID.randomUUID().toString();


    }

    public String getName() {
        return name;
    }

    public String getId() {
        return productID;
    }

    @Override
    public String toString() {
        return name;
    }
}
