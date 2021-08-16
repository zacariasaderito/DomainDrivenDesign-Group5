package za.ac.cput.factory;
/** OrderDetailsFactory.java
 *  Testing the Factory for Order Details
 * Author: Mehluli Dlamini (219105359)
 * 11 June 2021
 **/
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.OrderDetails;

class OrderDetailsFactoryTest {
    @Test
    void createOrderDetails() {
        OrderDetails orderdetails = OrderDetailsFactory.createOrderDetails("859 Upalite Street , Kirkney Village , Pretoria 0082", 100,50, 150 );
        System.out.println(orderdetails);
    }
}