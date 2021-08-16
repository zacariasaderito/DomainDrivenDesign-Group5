package za.ac.cput.service.implamentation;

import za.ac.cput.entity.ShippingDetails;
import za.ac.cput.repository.ShippingDetailsRepository;
import za.ac.cput.service.ShippingDetailsService;

public class ShippingDetailsServiceImplementation implements ShippingDetailsService {

    private static ShippingDetailsService ShippingService = null;
    private ShippingDetailsRepository ShippingRepository;

    @Override
    public ShippingDetails create(ShippingDetails shippingDetails) {
        return this.ShippingRepository.create(shippingDetails);
    }

    @Override
    public ShippingDetails read(String s) {
        return this.ShippingRepository.read(s);
    }

    @Override
    public ShippingDetails update(ShippingDetails shippingDetails) {
        return this.ShippingRepository.update(shippingDetails);
    }

    @Override
    public boolean delete(String s) {
        return this.ShippingRepository.delete(s);
    }
}
