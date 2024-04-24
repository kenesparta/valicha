package com.valicha.production.bandeja.domain.service;

import com.valicha.production.bandeja.domain.Bandeja;
import com.valicha.production.bandeja.domain.repository.BandejaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BandejaService {
    @Autowired
    private BandejaRepository bandejaRepository;

    public void createBandeja(Bandeja bandeja){
        bandejaRepository.save(bandeja);
    }
}
