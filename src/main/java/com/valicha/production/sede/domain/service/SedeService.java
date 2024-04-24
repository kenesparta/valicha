package com.valicha.production.sede.domain.service;

import com.valicha.production.sede.domain.Sede;
import com.valicha.production.sede.domain.repository.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SedeService {
    @Autowired
    private SedeRepository sedeRepository;
    public void createSede(Sede sede){
        sedeRepository.save(sede);
    }

    public List<Sede> getAllSede() {
        return (List<Sede>) sedeRepository.findAll();
    }
}
