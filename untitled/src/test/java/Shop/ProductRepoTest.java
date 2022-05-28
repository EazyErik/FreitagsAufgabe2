package Shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void shouldReturnAListWithAllMyProducts() {
        //given
        HashMap<String,Product> testMap = new HashMap<>();
        Product product1 = new Product("pineapple");
        Product product2 = new Product("rum");
        Product product3 = new Product("coconut");

        testMap.put(product1.getId(),product1);
        testMap.put(product2.getId(),product2);
        testMap.put(product3.getId(),product3);

        //when
        List<Product> testList = testMap.values().stream().toList();

        //then
        Assertions.assertTrue(testList.contains(product1));
        Assertions.assertTrue(testList.contains(product2));
        Assertions.assertTrue(testList.contains(product3));

        /*Map gibt Werte nur ungeordet wider,Liste gibt Werte geordnet wider, daher kann ich beide Datenstrukturen nicht
        vergleichen und ueberpruefe nur, ob meine Liste das Produkt enthaelt;
        */
    }

}