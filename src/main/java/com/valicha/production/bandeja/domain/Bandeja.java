package com.valicha.production.bandeja.domain;

import com.valicha.production.almacen.domain.Almacen;
import com.valicha.production.sede.domain.Sede;

public class Bandeja {
    private Long id;
    private Almacen almacen_id;
    private String codigo;
    private Double capacidad;

    public Bandeja(Long id, Almacen almacen_id, String codigo, Double capacidad) {
        this.id = id;
        this.almacen_id = almacen_id;
        this.codigo = codigo;
        this.capacidad = capacidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Almacen getAlmacen_id() {
        return almacen_id;
    }

    public void setAlmacen_id(Almacen almacen_id) {
        this.almacen_id = almacen_id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }
}
