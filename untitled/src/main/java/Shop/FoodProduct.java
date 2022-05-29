package Shop;

import java.util.UUID;

public class FoodProduct extends Product implements ProductInterface {


    public FoodProduct(String name) {
        super(name);
    }

    @Override
    public String productID() {
        return UUID.randomUUID().toString();
    }
}
