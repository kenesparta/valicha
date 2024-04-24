package com.valicha.production.moduloCrecimiento.domain;

import com.valicha.production.sede.domain.Sede;
import jakarta.persistence.*;


@Entity
public class ModuloCrecimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Sede sede_id;
    @Basic
    private String codigo;
    private Double capacidad;

    public ModuloCrecimiento(Long id, Sede sede_id, String codigo, Double capacidad) {
        this.id = id;
        this.sede_id = sede_id;
        this.codigo = codigo;
        this.capacidad = capacidad;
    }

    public ModuloCrecimiento() {
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
