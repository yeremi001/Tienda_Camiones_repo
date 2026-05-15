package com.example.ms_buses.service;

import java.util.List;

import com.example.ms_buses.model.Bus;

public interface BusService {
    List<Bus> listar();

    Bus guardar(Bus bus);

    Bus buscar(Long id);

    void eliminar(Long id);
}
