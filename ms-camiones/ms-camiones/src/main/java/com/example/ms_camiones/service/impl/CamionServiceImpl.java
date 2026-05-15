package com.example.ms_camiones.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ms_camiones.model.Camion;
import com.example.ms_camiones.repository.CamionRepository;

@Service
public class CamionServiceImpl {
    private final CamionRepository repository;

    public CamionServiceImpl(CamionRepository repository) {
        this.repository = repository;
    }

    public List<Camion> listar() {
        return repository.findAll();
    }

    public Camion guardar(Camion camion) {
        return repository.save(camion);
    }

    public Camion buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
