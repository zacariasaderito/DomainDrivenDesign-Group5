package za.ac.cput.Factory;

/* ProductFactoryTest.java
Testing the Factory for Product
Author: Moegammad Ameer Dollie (218336934)
Date: 11 June 2021
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Product;
import static org.junit.jupiter.api.Assertions.*;

class ProductFactoryTest {

    @Test
    void createProduct(){
        Product product = ProductFactory.createProduct("Bread", 15);
        System.out.println(product);
    }
}