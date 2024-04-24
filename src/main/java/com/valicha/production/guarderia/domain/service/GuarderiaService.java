package com.valicha.production.guarderia.domain.service;

import com.valicha.production.guarderia.domain.Guarderia;
import com.valicha.production.guarderia.domain.repository.GuarderiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuarderiaService {
    @Autowired
    private GuarderiaRepository guarderiaRepository;

    public void createGuarderia(Guarderia guarderia){
        guarderiaRepository.save(guarderia);

    }
}
