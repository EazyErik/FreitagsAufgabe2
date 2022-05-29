package Shop;

import java.util.UUID;

public class NonFoodProducts extends Product implements ProductInterface {


    public NonFoodProducts(String name) {
        super(name);
    }


    @Override
    public String productID() {
        return UUID.randomUUID().toString();
    }
}
