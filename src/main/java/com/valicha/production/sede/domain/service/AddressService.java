package com.valicha.production.sede.domain.service;

import com.valicha.production.sede.domain.Address;
import com.valicha.production.sede.domain.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public void createAddress(Address address){
        addressRepository.save(address);
    }

    public List<Address> getAllAddress() {
        return (List<Address>) addressRepository.findAll();
    }
}
