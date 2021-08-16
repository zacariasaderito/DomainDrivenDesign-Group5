package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Payment;

/** PaymentFactoryTest.java
 *  Factory Testing for Payment
 *  Author: Chadleigh Dunbar (218065256)
 *  Date: 11 June 2021
 */

public class PaymentFactoryTest {
    @Test
    void createPayment() {
        Payment p = PaymentFactory.payment("Visa");
        System.out.println(p);
    }


}
