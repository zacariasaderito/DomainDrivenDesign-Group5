package za.ac.cput.Factory;

/* ProductFactory.java
Factory for Product
Author: Moegammad Ameer Dollie (218336934)
Date: 11 June 2021
*/

import za.ac.cput.Entity.Product;
import za.ac.cput.Util.GenericHelper;

public class ProductFactory{
    public static Product createProduct(String prodName, int prodPrice){
        String productId = GenericHelper.generateAnId();
        Product product = new Product.Builder()
                .setProdId(productId)
                .setProdName(prodName)
                .setProdPrice(prodPrice)
                .build();

        return product;
    }
}
