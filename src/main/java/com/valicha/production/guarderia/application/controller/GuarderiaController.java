package com.valicha.production.guarderia.application.controller;

import com.valicha.production.guarderia.domain.Guarderia;
import com.valicha.production.guarderia.domain.service.GuarderiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("production/v1")
@RestController
public class GuarderiaController {
    @Autowired
    private GuarderiaService guarderiaService;
    @PostMapping("/guarderia")
    public void createGuarderia(@RequestBody Guarderia guarderia){
        guarderiaService.createGuarderia(guarderia);

    }
}
