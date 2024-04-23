package com.valicha.production.guarderia.domain;

import com.valicha.production.sede.domain.Sede;

public class Guarderia {
    private Long id;
    private Sede sede_id;
    private String codigo;
    private Double capacidad;

    public Guarderia(Long id, Sede sede_id, String codigo, Double capacidad) {
        this.id = id;
        this.sede_id = sede_id;
        this.codigo = codigo;
        this.capacidad = capacidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sede getSede_id() {
        return sede_id;
    }

    public void setSede_id(Sede sede_id) {
        this.sede_id = sede_id;
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
