package za.ac.cput.Factory;
/**
 * ShippingDetailsFactory.java
 * Shipping Details Factory
 * Author: Aderito Zacarias (215278739)
 * 11 June 2021
 **/

import za.ac.cput.Entity.ShippingDetails;
import za.ac.cput.Util.GenericHelper;

import java.util.UUID;

public class ShippingDetailsFactory {
    public static ShippingDetails getShippingDetails(String shippingType, double shippingCost){
        String shippingId = GenericHelper.generateAnId();
        return new ShippingDetails.Builder()
                    .setShippingId(shippingId)
                    .setShippingType(shippingType)
                    .setShippingCost(shippingCost)
                    .build();
    }


}
