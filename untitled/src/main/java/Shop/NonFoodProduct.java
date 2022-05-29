package Shop;

import java.util.UUID;

public class NonFoodProduct extends Product implements ProductInterface {


    public NonFoodProduct(String name) {
        super(name);
    }


    @Override
    public String productID() {
        return UUID.randomUUID().toString();
    }
}
