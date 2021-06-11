package za.ac.cput.Factory;
import za.ac.cput.Entity.Customer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*Customer.java
Entity for Customer
Author: Damian Du Toit (219200203)
Date: 11 June 2021
 */

//Test Class for Customer Factory
class CustomerFactoryTest
{
    @Test
     void createCustomer()
    {
        Customer customer = CustomerFactory.createCustomer(90, "John", "0724457685", "john@example.net");
        System.out.println(customer);
    }
}
