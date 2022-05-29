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

        String expected = "Pringles";
        Product product = new Product(expected);

        //when
        orderRepo.addOrder(List.of(product));


        //then
        Assertions.assertEquals(expected,orderRepo.list().get(0).toString());



    }

}