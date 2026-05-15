package com.example.ms_compra.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ms_compra.model.Compra;
import com.example.ms_compra.repository.CompraRepository;

@Service
public class CompraServiceImpl {
    private final CompraRepository repository;

    public CompraServiceImpl(CompraRepository repository) {
        this.repository = repository;
    }

    public List<Compra> listar() {
        return repository.findAll();
    }

    public Compra guardar(Compra compra) {
        return repository.save(compra);
    }
}
