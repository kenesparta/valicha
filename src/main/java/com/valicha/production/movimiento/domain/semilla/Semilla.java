package com.valicha.production.movimiento.domain.semilla;

import java.util.Date;

public class Semilla {
    private Long id;
    private Long cantidad;
    private Date fecha;

    public Semilla(Long cantidad, Date fecha) {
        this.cantidad = cantidad;
        this.fecha = fecha;
    }
}
