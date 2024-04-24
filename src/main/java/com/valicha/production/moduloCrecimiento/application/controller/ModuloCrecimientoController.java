package com.valicha.production.moduloCrecimiento.application.controller;

import com.valicha.production.moduloCrecimiento.domain.ModuloCrecimiento;
import com.valicha.production.moduloCrecimiento.domain.service.ModuloCrecimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("production/v1")
@RestController
public class ModuloCrecimientoController {

    @Autowired
    private ModuloCrecimientoService moduloCrecimientoService;
    @PostMapping("/modulo-crecimiento")
    @ResponseBody
    public void createModuloCrecimiento(@RequestBody ModuloCrecimiento moduloCrecimiento){
        moduloCrecimientoService.createModuloCrecimiento(moduloCrecimiento);

    }
}
