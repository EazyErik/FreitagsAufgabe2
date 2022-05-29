package Shop;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ShopService myShop = new ShopService(new ProductRepo(), new OrderRepo());
        try{
            System.out.println(myShop.getProduct("123"));
        }catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }




    }




}
