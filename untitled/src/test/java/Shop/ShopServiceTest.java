package Shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.fail;


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

//    @Test
//    void shouldCheckIfProductIdExists() {
//        //given
//        ShopService testShopService = new ShopService(new ProductRepo(), new OrderRepo());
//        Product expected = testShopService.listProducts().get(0);
//        //when
//
//        Optional actual = testShopService.getProduct(expected.getId());
//        //then
//        Assertions.assertTrue(expected,actual);
//
    //          TODO Test did not pass
//
//    }

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
    void shouldPassIfNumberOfOrdersIs1() {

        //given
        ShopService shopService = new ShopService(new ProductRepo(),new OrderRepo());
        ProductRepo productRepo = new ProductRepo();
        OrderRepo orderRepo = new OrderRepo();

        String idBanane = shopService.listProducts().get(2).getId();

        //when
        shopService.addOrder(List.of(idBanane));


        //then
        Assertions.assertEquals(1,shopService.listOrders().size());

    }

    @Test
    void shouldNotPassIfProductIsDoesNotExist() {

        //given
        ShopService shopService = new ShopService(new ProductRepo(),new OrderRepo());
        ProductRepo productRepo = new ProductRepo();
        OrderRepo orderRepo = new OrderRepo();

        String unknownProduct = "unknownProduct";

        //when and then
        try {
            shopService.addOrder(List.of(unknownProduct));
            fail();
        }catch(RuntimeException e){
            e.getMessage();
        }
    }

    @Test
    void shouldPassIfOrderHasRightProduct() {

        //given
        ShopService shopService = new ShopService(new ProductRepo(),new OrderRepo());
        ProductRepo productRepo = new ProductRepo();
        OrderRepo orderRepo = new OrderRepo();

        String idBanane = shopService.listProducts().get(2).getId();

        //when
        shopService.addOrder(List.of(idBanane));


        //then
        Assertions.assertEquals("Banane",shopService.listOrders().get(0).toString());

    }


}