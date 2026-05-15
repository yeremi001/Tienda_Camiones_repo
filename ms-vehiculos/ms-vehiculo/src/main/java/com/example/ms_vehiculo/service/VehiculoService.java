package com.example.ms_vehiculo.service;

import java.util.List;

import com.example.ms_vehiculo.model.Vehiculo;

public interface VehiculoService {
    List<Vehiculo> listar();
    Vehiculo guardar(Vehiculo vehiculo);
    Vehiculo buscar(Long id);
    Vehiculo actualizar(Long id, Vehiculo vehiculo);
    void eliminar(Long id);
}
