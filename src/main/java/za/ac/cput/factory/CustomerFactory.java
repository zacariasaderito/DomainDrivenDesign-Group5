package za.ac.cput.factory;
import za.ac.cput.entity.Customer;
import java.util.UUID;

/*CustomerFactory.java
Entity for Customer
Author: Damian Du Toit (219200203)
Date: 11 June 2021
 */

//Customer Factory Class
public class CustomerFactory
{
    public static Customer createCustomer(int cusId, String cusName, String cusPhoneNum, String cusEmail)
    {
        String cusPassword = UUID.randomUUID().toString();
        String shippingAddress1 = UUID.randomUUID().toString();
        String shippingAddress2 = UUID.randomUUID().toString();

        Customer customer = new Customer.Builder()
                .cusId(cusId)
                .cusName(cusName)
                .cusPhoneNum(cusPhoneNum)
                .cusEmail(cusEmail)
                .cusPassword(cusPassword)
                .shippingAddress1(shippingAddress1)
                .shippingAddress2(shippingAddress2)
                .build();

        return customer;
    }
}
