package com.valicha.production.bandeja.application;

import com.valicha.production.bandeja.domain.Bandeja;
import com.valicha.production.bandeja.domain.service.BandejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("production/v1")

@RestController
public class BandejaController {
    @Autowired
    private BandejaService bandejaService;
    @PostMapping("/bandeja")

    public void createBandeja(@RequestBody Bandeja bandeja){
        bandejaService.createBandeja(bandeja);

    }

}
