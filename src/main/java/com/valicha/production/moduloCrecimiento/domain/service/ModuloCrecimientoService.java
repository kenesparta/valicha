package com.valicha.production.moduloCrecimiento.domain.service;

import com.valicha.production.moduloCrecimiento.domain.ModuloCrecimiento;
import com.valicha.production.moduloCrecimiento.domain.repository.ModuloCrecimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuloCrecimientoService  {

    @Autowired
    private ModuloCrecimientoRepository moduloCrecimientoRepository;
    public void createModuloCrecimiento(ModuloCrecimiento moduloCrecimiento){
        moduloCrecimientoRepository.save(moduloCrecimiento);
    }
}
