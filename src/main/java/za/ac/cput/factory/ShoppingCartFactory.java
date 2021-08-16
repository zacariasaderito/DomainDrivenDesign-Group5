/* ShoppingCartFactory.java
   Factory class for ShoppingCart
   Author: Christopher Doolings
   Date: 9 June 2021
 */

package za.ac.cput.factory;

import za.ac.cput.entity.ShoppingCart;

import java.util.UUID;

public class ShoppingCartFactory {
    public static ShoppingCart createShoppingCart(int quantity, double orderPrice) {
        String customerId = UUID.randomUUID().toString();
        String productId = UUID.randomUUID().toString();
        ShoppingCart shoppingCart = new ShoppingCart.Builder()
                .customerId(customerId)
                .productId(productId)
                .quantity(quantity)
                .orderPrice(orderPrice)
                .build();

        return shoppingCart;
    }
}
