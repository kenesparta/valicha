package com.valicha.production.almacen.application;

import com.valicha.production.almacen.domain.Almacen;
import com.valicha.production.almacen.domain.AlmacenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("demo/v1")
@RestController
public class AlmacenController {
    @Autowired
    AlmacenService almacenService;

    @PostMapping("/almacen")
    public void createAlmacen(@RequestBody Almacen almacen){
        almacenService.createAlmacen(almacen);
    }
}
