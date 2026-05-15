package com.example.ms_camiones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ms_camiones.model.Camion;

public interface CamionRepository extends JpaRepository<Camion, Long> {

}
