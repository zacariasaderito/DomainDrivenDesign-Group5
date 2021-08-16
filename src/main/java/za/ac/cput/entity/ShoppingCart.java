/* ShoppingCart.java
   Entity for ShoppingCart
   Author: Christopher Doolings
   Date: 9 June 2021
 */

package za.ac.cput.entity;

public class ShoppingCart {
    private String customerId, productId;
    private int quantity;
    private double orderPrice;

    public ShoppingCart(Builder builder) {
        this.customerId = builder.customerId;
        this.productId = builder.productId;
        this.quantity = builder.quantity;
        this.orderPrice = builder.orderPrice;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "customerId='" + customerId + '\'' +
                ", productId='" + productId + '\'' +
                ", quantity=" + quantity +
                ", orderPrice=" + orderPrice +
                '}';
    }

    //Inner class
    public static class Builder {
        private String customerId, productId;
        private int quantity;
        private double orderPrice;

        public Builder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder orderPrice(double orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public ShoppingCart build() {
            return new ShoppingCart(this);
        }

        //Copy of ShoppingCart
        public Builder copy(ShoppingCart shoppingCart) {
            this.customerId = shoppingCart.customerId;
            this.productId = shoppingCart.productId;
            this.quantity = shoppingCart.quantity;
            this.orderPrice = shoppingCart.orderPrice;
            return this;
        }
    }
}
