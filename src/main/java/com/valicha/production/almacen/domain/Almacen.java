package com.valicha.production.almacen.domain;


import com.valicha.production.sede.domain.Sede;
import jakarta.persistence.*;

@Entity
public class Almacen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
   private Sede sede_id;

    private String nombre;

    public Long getId() {
        return id;
    }

    public Almacen() {
    }

    public Almacen(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
