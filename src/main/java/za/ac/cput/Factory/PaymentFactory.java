package za.ac.cput.Factory;

import za.ac.cput.Entity.Payment;
import java.util.UUID;

/** PaymentFactory.java
 *  Factory for Payment
 *  Author: Chadleigh Dunbar (218065256)
 *  Date: 11 June 2021
 */

public class PaymentFactory {

        public static Payment payment(String paymentType){
            if(paymentType.isEmpty())
                return null;
            String paymentId = UUID.randomUUID().toString();
            return new Payment.Builder()
                    .setPaymentId(paymentId).setPaymentType(paymentType).build();
        }
}


