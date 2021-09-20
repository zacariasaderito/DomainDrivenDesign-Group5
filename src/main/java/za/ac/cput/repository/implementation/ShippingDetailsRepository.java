package za.ac.cput.repository.implementation;

import za.ac.cput.entity.ShippingDetails;
import za.ac.cput.repository.IShippingDetailsRepository;

import java.util.HashSet;
import java.util.Set;


public class ShippingDetailsRepository implements IShippingDetailsRepository {

    private static ShippingDetailsRepository repository = null;
    private Set<ShippingDetails>  shippingDetailsDB;

    public ShippingDetailsRepository() {
        this.shippingDetailsDB = new HashSet<>();
    }

    public static ShippingDetailsRepository getRepository() {
        if (repository == null) {
            repository = new ShippingDetailsRepository();
        }
        return repository;
    }

    @Override
    public ShippingDetails create(ShippingDetails shippingDetails) {
        shippingDetailsDB.add(shippingDetails);
        return null;
    }

    @Override
    public ShippingDetails read(String shippingID) {
        for (ShippingDetails shippingDetails : this.shippingDetailsDB) {
            if (shippingDetails.getShippingId().equalsIgnoreCase(shippingID))
                return shippingDetails;
        }
        return null;
    }

    @Override
    public ShippingDetails update(ShippingDetails shippingDetails) {
        boolean deleteShipping = delete(shippingDetails.getShippingId());
        if (deleteShipping) {
            this.shippingDetailsDB.add(shippingDetails);
            return shippingDetails;
        }
        return null;
    }

    @Override
    public boolean delete(String shippingID) {
        ShippingDetails shippingDetails = read(shippingID);
        if (shippingDetails != null) {
            this.shippingDetailsDB.remove(shippingDetails);
            return true;
        }
        return false;
    }

    @Override
    public Set<ShippingDetails> getAll() {
        return this.shippingDetailsDB;
    }
}
