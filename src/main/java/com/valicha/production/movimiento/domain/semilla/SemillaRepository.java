package com.valicha.production.movimiento.domain.semilla;

import com.valicha.production.almacen.domain.AlmacenId;
import com.valicha.production.bandeja.domain.BandejaId;

public interface SemillaRepository {
    void save(Semilla semilla, AlmacenId almacenId, BandejaId bandejaId);
}
