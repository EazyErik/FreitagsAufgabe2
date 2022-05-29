package Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShopService {

    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public Optional<Product> getProduct(String productID) {

            Optional<Product> currentProduct = productRepo.getProductByID(productID);
            if( currentProduct == null) {
            throw new RuntimeException("Product with this id: " + productID + " is not available");
        }
            return currentProduct;
    }

    public List<Product> listProducts() {
       return productRepo.list();

    }
    public void addOrder(List<String> productIDs) {
        List<Product> validProducts = new ArrayList<>();
        for(String productID : productIDs) {
            Optional<Product> productToCheck = productRepo.getProductByID(productID);
            if(productToCheck.isEmpty()) {
                throw new RuntimeException("No such productID: " + productID);
            }
            validProducts.add(productToCheck.get());
        }

        orderRepo.addOrder(validProducts);
    }
    public Order getOrder(String id) {
        Optional<Order> currentOrder = orderRepo.get(id);
        return currentOrder.orElseThrow(() -> new RuntimeException("There is no order with " + id));


    }
    public List<Order> listOrders() {
        return orderRepo.list();
    }





}
