package Shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void shouldReturnTheProductName(){


        //given
        String expected = "Cheese";
        Product product = new Product(expected);
        //when
        String actual = product.getName();
        //then
        Assertions.assertEquals(expected,actual);

    }

    // ProductID kann nicht so richtig getestet werden,da sie mit random() zufaellig erzeugt wird

}