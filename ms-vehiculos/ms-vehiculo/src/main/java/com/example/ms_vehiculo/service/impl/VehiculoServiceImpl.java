package com.example.ms_vehiculo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ms_vehiculo.model.Vehiculo;
import com.example.ms_vehiculo.repository.VehiculoRepository;

@Service
public class VehiculoServiceImpl {
    private final VehiculoRepository repository;

    public VehiculoServiceImpl(VehiculoRepository repository) {
        this.repository = repository;
    }

    public List<Vehiculo> listar() {
        return repository.findAll();
    }

    public Vehiculo guardar(Vehiculo vehiculo) {
        return repository.save(vehiculo);
    }

    public Vehiculo buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Vehiculo actualizar(Long id, Vehiculo vehiculo) {

        Vehiculo actual = repository.findById(id).orElse(null);

        if (actual == null) {
            return null;
        }

        actual.setMarca(vehiculo.getMarca());
        actual.setModelo(vehiculo.getModelo());
        actual.setAnio(vehiculo.getAnio());
        actual.setPrecio(vehiculo.getPrecio());
        actual.setEstado(vehiculo.getEstado());

        return repository.save(actual);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
