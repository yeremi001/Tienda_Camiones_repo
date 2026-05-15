package com.example.ms_camiones.service;

import java.util.List;

import com.example.ms_camiones.model.Camion;

public interface CamionService {
    List<Camion> listar();
    Camion guardar(Camion camion);
    Camion buscar(Long id);
    void eliminar(Long id);
}
