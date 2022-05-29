package Shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


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
            ;
        }

    }


}