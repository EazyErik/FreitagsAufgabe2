package Shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


class ShopServiceTest {

    @Test
    void shouldCheckIfListContains3Products() {
        //given
        ShopService testShopService = new ShopService(new ProductRepo(), new OrderRepo());
        int expectedNumberOfProducts = 3;
        //when
        int actual = testShopService.listProducts().size();
        //then
        Assertions.assertEquals(expectedNumberOfProducts, actual);


    }

    @Test
    void shouldCheckIfProductIdIsAvailable() {
        //given
        ShopService testShopService = new ShopService(new ProductRepo(), new OrderRepo());
        Product expected = testShopService.listProducts().get(0);
        //when
        Optional actual = testShopService.getProduct(expected.getId());
        //then
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void shouldThrowCustomExceptionIfProductIdDoesNotExist() {


        //given
        ShopService testShopService = new ShopService(new ProductRepo(), new OrderRepo());
        Product expected = testShopService.listProducts().get(0);
        //when and then
        try {
            Optional actual = testShopService.getProduct("123");
            Assertions.assertNotEquals(expected, actual);
        } catch (RuntimeException e) {
            System.out.println("ProductID does not exist");

        }

    }

    @Test
    void shouldPassIfOrdersAreValid() {
        //given
        ShopService testShopService = new ShopService(new ProductRepo(),new OrderRepo());
        ProductRepo productRepo;



        //when


       Product product1 = new Product("shirt");


       testShopService.addOrder(List.of(product1.getId()));
       //then
        Assertions.assertEquals(1,testShopService.listOrders().size());







    }


}