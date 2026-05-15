package com.example.ms_electronica.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ElectronicaDTO {
    private Long id;
    private String nombreProducto;
    private String marca;
    private String categoria;

    private Double precio;

    private Integer stock;

    private String descripcion;
}
