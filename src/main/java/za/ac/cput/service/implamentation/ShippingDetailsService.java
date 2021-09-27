package za.ac.cput.service.implamentation;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.ShippingDetails;
import za.ac.cput.repository.IShippingDetailsRepository;
import za.ac.cput.repository.implementation.ShippingDetailsRepository;
import za.ac.cput.service.IShippingDetailsService;

import java.util.Set;

@Service
public class ShippingDetailsService implements IShippingDetailsService {

    private static ShippingDetailsService shippingService = null;
    private ShippingDetailsRepository shippingRepository =null;

    private ShippingDetailsService() { this.shippingRepository = ShippingDetailsRepository.getRepository();
    }

    public static ShippingDetailsService getShippingService() {
        if (shippingService == null)
            shippingService = new ShippingDetailsService();
        return shippingService;
    }

    @Override
    public ShippingDetails create(ShippingDetails shippingDetails) {
        return this.shippingRepository.create(shippingDetails);
    }

    @Override
    public ShippingDetails read(String s) {
        return this.shippingRepository.read(s);
    }

    // Requires attention
    @Override
    public ShippingDetails update(ShippingDetails shippingDetails) {
        return this.shippingRepository.update(shippingDetails, "", 00);
    }

    @Override
    public boolean delete(String s) {
        return this.shippingRepository.delete(s);
    }

    @Override
    public Set<ShippingDetails> getAll() {
        return shippingRepository.getAll();
    }


}
