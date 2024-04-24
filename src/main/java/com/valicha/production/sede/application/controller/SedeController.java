package com.valicha.production.sede.application.controller;

import com.valicha.production.sede.domain.Sede;
import com.valicha.production.sede.domain.service.SedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("production/v1")
public class SedeController {
    @Autowired
    private SedeService sedeService;
    @PostMapping("/sede")
    public void createSede(@RequestBody Sede sede){
        sedeService.createSede(sede);

    }

    @GetMapping("/sede")
    public List<Sede> getAllSede(){
        return sedeService.getAllSede();

    }
}
