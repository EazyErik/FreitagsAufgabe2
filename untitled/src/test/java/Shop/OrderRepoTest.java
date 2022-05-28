package Shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {

    @Test
    void shouldReturnTrueIfMapIsNotEmpty() {
        //given
        OrderRepo orderRepo = new OrderRepo();
        HashMap<String,Product> testMap = new HashMap<>();
        String expected = "Pringles";

        //when
        orderRepo.add(new Order(new Product("Pringles")));


        //then
        Assertions.assertEquals(expected,orderRepo.list().get(0).toString());



    }

}