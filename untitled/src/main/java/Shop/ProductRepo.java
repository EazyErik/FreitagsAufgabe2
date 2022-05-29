package Shop;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class ProductRepo {

    private HashMap<String, Product> allMyProducts = new HashMap<>();

    public ProductRepo() {
        Product product = new Product("Käse");
        Product product2 = new Product("Apfel");
        Product product3 = new Product("Banane");
        allMyProducts.put(product.getId(), product);
        allMyProducts.put(product2.getId(), product2);
        allMyProducts.put(product3.getId(), product3);


    }

    List<Product> list() {
        return allMyProducts.values().stream().toList();


    }

    Optional<Product> getProductByID(String id) {
        return Optional.ofNullable(allMyProducts.get(id));
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "allMyProducts=" + allMyProducts +
                '}';
    }
}

