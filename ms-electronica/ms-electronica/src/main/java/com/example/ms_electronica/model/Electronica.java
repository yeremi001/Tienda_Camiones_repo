package com.example.ms_electronica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "electronica")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Electronica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreProducto;

    private String marca;

    private String categoria;

    private Double precio;

    private Integer stock;

    private String descripcion;
}
