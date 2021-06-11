package za.ac.cput.Factory;

/**
 * ShippingDetailsFactory.java
 * Shipping Details Factory
 * Author: Aderito Zacarias (215278739)
 * 11 June 2021
 **/


import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.ShippingDetails;

import static org.junit.jupiter.api.Assertions.*;

class ShippingDetailsFactoryTest {

    @Test
    public void testFactory(){

        ShippingDetails shippingDetails = new ShippingDetailsFactory().getShippingDetails("Delivery",2);

        assertNotNull(shippingDetails);
        assertEquals("Delivery", shippingDetails.getShippingType());
        assertNotEquals(845, shippingDetails.getShippingCost());

        System.out.println(shippingDetails);
    }

}