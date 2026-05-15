package com.example.ms_vehiculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ms_vehiculo.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
}
