package com.example.ms_compra.service;

import java.util.List;

import com.example.ms_compra.model.Compra;

public interface CompraService {
    List<Compra> listar();

    Compra guardar(Compra compra);
}
