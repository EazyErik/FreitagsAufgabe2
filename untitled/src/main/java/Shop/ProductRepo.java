package Shop;

import java.util.HashMap;
import java.util.List;

public class ProductRepo {

    private HashMap<String, Product> allMyProducts = new HashMap<>();

    public ProductRepo() {
        Product product = new Product("Käse");
        Product product2 = new Product("Apfel");
        Product product3 = new Product("Banane");
        allMyProducts.put(product.getId(), product);
        allMyProducts.put(product.getId(), product2);
        allMyProducts.put(product.getId(), product3);


    }

    public List<Product> list() {
        return allMyProducts.values().stream().toList();


    }
    public Product get(String id) {
        return allMyProducts.get(id);
    }



}

