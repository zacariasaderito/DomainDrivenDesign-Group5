package za.ac.cput.entity;

/* Product.java
Entity for Product
Author: Moegammad Ameer Dollie (218336934)
Date: 11 June 2021
*/

public class Product {
    private String prodId;
    private String prodName;
    private double prodPrice;

    private Product(Builder builder) {
        this.prodId = builder.prodId;
        this.prodName = builder.prodName;
        this.prodPrice = builder.prodPrice;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", prodPrice=" + prodPrice +
                '}';
    }

    public static class Builder{
        private String prodId;
        private String prodName;
        private double prodPrice;

        public Builder setProdId(String prodId) {
            this.prodId = prodId;
            return this;
        }

        public Builder setProdName(String prodName) {
            this.prodName = prodName;
            return this;
        }

        public Builder setProdPrice(double prodPrice) {
            this.prodPrice = prodPrice;
            return this;
        }

        public Product build(){

            return new Product(this);
        }

        public Builder copy(Product product){
            this.prodId = product.prodId;
            this.prodName = product.prodName;
            this.prodPrice = product.prodPrice;

            return this;
        }
    }
}