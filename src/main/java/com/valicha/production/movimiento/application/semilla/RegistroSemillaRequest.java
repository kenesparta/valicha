package com.valicha.production.movimiento.application.semilla;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroSemillaRequest {
    private Date fechaRegistro;
    private Long almacenID;
    private Long bandejaID;
    private Long cantidad;
}
