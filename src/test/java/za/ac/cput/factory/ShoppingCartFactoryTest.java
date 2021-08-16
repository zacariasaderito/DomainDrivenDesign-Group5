/* ShoppingCartFactoryTest.java
   Test for ShoppingCartFactory
   Author: Christopher Doolings
   Date: 9 June 2021
 */

package za.ac.cput.factory;

import za.ac.cput.entity.ShoppingCart;
import org.junit.jupiter.api.Test;

class ShoppingCartFactoryTest {

    @Test
    void createShoppingCart() {
        ShoppingCart shoppingCart = ShoppingCartFactory.createShoppingCart(50, 900);
        System.out.println(shoppingCart);
    }
}
