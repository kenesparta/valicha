package com.valicha.production.movimiento.application.semilla;

import com.valicha.production.almacen.domain.AlmacenId;
import com.valicha.production.bandeja.domain.BandejaId;
import com.valicha.production.movimiento.domain.semilla.Semilla;
import com.valicha.production.movimiento.domain.semilla.SemillaRepository;

public class RegistradorSemillas {
    public SemillaRepository semillaRepository;

    public RegistradorSemillas(SemillaRepository semillaRepository) {
        this.semillaRepository = semillaRepository;
    }

    public void registrar(RegistroSemillaRequest registroSemillaRequest) {
        semillaRepository.save(
                new Semilla(
                        registroSemillaRequest.getCantidad(),
                        registroSemillaRequest.getFechaRegistro()
                ),
                new AlmacenId(registroSemillaRequest.getAlmacenID()),
                new BandejaId(registroSemillaRequest.getBandejaID())
        );
    }
}
