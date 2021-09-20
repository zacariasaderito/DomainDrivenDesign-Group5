package za.ac.cput.repository.implementation;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.ShippingDetails;
import za.ac.cput.factory.ShippingDetailsFactory;

import static org.junit.jupiter.api.Assertions.*;

class ShippingDetailsRepositoryTest {

    ShippingDetailsRepository repository;

    @Test
    void getRepository() {
         repository = ShippingDetailsRepository.getRepository();

        assertNotNull(repository);
        assertEquals(repository, ShippingDetailsRepository.getRepository());

    }

    @Test
    void create() {
        ShippingDetails shippingDetailsByRoad = ShippingDetailsFactory.getShippingDetails("Road", 200);
        ShippingDetails shippingDetailsByAir = ShippingDetailsFactory.getShippingDetails("Air", 400);
        ShippingDetails shippingDetailsBySea = ShippingDetailsFactory.getShippingDetails("Sea", 250);

        repository = ShippingDetailsRepository.getRepository();

        repository.create(shippingDetailsByAir);
        repository.create(shippingDetailsByRoad);
        repository.create(shippingDetailsBySea);

        assertNotNull(shippingDetailsByAir);
        assertNotNull(shippingDetailsByRoad);
        assertNotNull(shippingDetailsBySea);

        assertNotEquals(shippingDetailsByAir, shippingDetailsByRoad);
        assertNotEquals(shippingDetailsByAir, shippingDetailsBySea);


        System.out.println(repository.getAll());

    }

    @Test
    void read() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void getAll() {
    }
}