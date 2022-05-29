package Shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {

    @Test
    void shouldReturnTrueIfMapIsNotEmpty() {
        //given
        OrderRepo orderRepo = new OrderRepo();
        ProductRepo productRepo = new ProductRepo();

        Product expected = productRepo.list().get(0);


        //when
        orderRepo.addOrder(List.of(expected));

        //then
        Assertions.assertEquals(expected,orderRepo.list().get(0).getProduct());




    }

}