package com.example.ms_buses.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ms_buses.model.Bus;
import com.example.ms_buses.repository.BusRepository;

@Service
public class BusServiceImpl {
    private final BusRepository repository;

    public BusServiceImpl(BusRepository repository) {
        this.repository = repository;
    }

    public List<Bus> listar() {
        return repository.findAll();
    }

    public Bus guardar(Bus bus) {
        return repository.save(bus);
    }

    public Bus buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
