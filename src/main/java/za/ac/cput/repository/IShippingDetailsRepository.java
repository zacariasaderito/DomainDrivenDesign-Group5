package za.ac.cput.repository;

import za.ac.cput.entity.ShippingDetails;

import java.util.Set;

public interface IShippingDetailsRepository extends IRepository<ShippingDetails, String>{
    Set<ShippingDetails> getAll();
}
