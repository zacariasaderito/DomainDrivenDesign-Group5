package za.ac.cput.controller;
/**
 * ShippingDetails.java
 * Shipping Details Entity
 * Author: Aderito Zacarias - 215278739
 * 11 June 2021
 **/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.ShippingDetails;
import za.ac.cput.factory.ShippingDetailsFactory;
import za.ac.cput.service.implamentation.ShippingDetailsService;

import java.util.Set;

@RestController
@RequestMapping("/ShippingDetails")
public class ShippingDetailsControlller {
    @Autowired
    private ShippingDetailsService shippingDetailsService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
//    @RequestMapping("/create")
    public ShippingDetails create(@RequestBody ShippingDetails shippingDetails){
//        ShippingDetails shippingDetails1 = ShippingDetailsFactory.getShippingDetails(shippingDetails.getShippingType(),shippingDetails.getShippingCost());
        return shippingDetailsService.create(shippingDetails);
    }

    @RequestMapping(value = "/create1", method = RequestMethod.POST)
//    @RequestMapping("/create")
    public ShippingDetails create1(@RequestBody ShippingDetails shippingDetails){
        ShippingDetails shippingDetails2 = ShippingDetailsFactory.getShippingDetails(shippingDetails.getShippingType(),shippingDetails.getShippingCost());
        return shippingDetails2;
    }

//    @RequestMapping(value = "/create3", method = RequestMethod.POST)
    @RequestMapping("/create")
    public ShippingDetails create3(@RequestBody ShippingDetails shippingDetails){
        ShippingDetails shippingDetails3 = ShippingDetailsFactory.getShippingDetails(shippingDetails.getShippingType(),shippingDetails.getShippingCost());
        return shippingDetailsService.create(shippingDetails3);
    }

    @GetMapping("/getall")
    public Set<ShippingDetails> getAll() {
        return shippingDetailsService.getAll();
    }


}
