package com.example.ms_compra.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_compra.model.Compra;
import com.example.ms_compra.service.CompraService;

@RestController
@RequestMapping("/compras")
public class CompraController {
    private final CompraService service;

    public CompraController(CompraService service) {
        this.service = service;
    }

    @GetMapping
    public List<Compra> listar() {
        return service.listar();
    }

    @PostMapping
    public Compra guardar(@RequestBody Compra compra) {
        return service.guardar(compra);
    }
}
