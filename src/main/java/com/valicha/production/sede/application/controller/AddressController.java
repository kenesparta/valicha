package com.valicha.production.sede.application.controller;

import com.valicha.production.sede.domain.Address;
import com.valicha.production.sede.domain.Sede;
import com.valicha.production.sede.domain.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("production/v1")
public class AddressController {
    @Autowired
    private AddressService addressService;
    @PostMapping("/address")

    public void createAddress(@RequestBody Address address){
        addressService.createAddress(address);
    }

    @GetMapping("/address")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();

    }

}
