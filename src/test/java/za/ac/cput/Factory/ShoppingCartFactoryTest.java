/* ShoppingCartFactoryTest.java
   Test for ShoppingCartFactory
   Author: Christopher Doolings
   Date: 9 June 2021
 */

package ac.za.cput.Factory;

import ac.za.cput.Entity.ShoppingCart;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartFactoryTest {

    @Test
    void createShoppingCart() {
        ShoppingCart shoppingCart = ShoppingCartFactory.createShoppingCart(50, 900);
        System.out.println(shoppingCart);
    }
}
