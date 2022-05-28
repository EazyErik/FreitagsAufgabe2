package Shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void shouldReturnTheOrderedProduct() {
        //given
        String orderedProduct = "Milk";
        Order order = new Order(new Product(orderedProduct));
        //when
        String actual = order.getProduct().getName();
        //then
        Assertions.assertEquals(orderedProduct,actual);


    }

}