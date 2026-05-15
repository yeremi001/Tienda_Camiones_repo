package com.example.ms_automotriz.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AutomotrizDTO {
    private Long id;

    private String nombre;

    private String direccion;

    private String telefono;

    private String correo;

    private String ciudad;
}
