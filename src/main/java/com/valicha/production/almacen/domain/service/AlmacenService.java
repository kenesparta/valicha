package com.valicha.production.almacen.domain.service;

import com.valicha.production.almacen.domain.Almacen;
import com.valicha.production.almacen.domain.repository.AlmacenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlmacenService {
    @Autowired
    AlmacenRepository almacenRepository;
    public void createAlmacen(Almacen almacen){
        almacenRepository.save(almacen);
    }
}
