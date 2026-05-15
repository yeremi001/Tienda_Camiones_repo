package com.example.ms_renta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_renta.model.Renta;

@RestController
@RequestMapping("/rentas")
public class RentaController {
    private final RentaRepository repository;

    public RentaController(RentaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Renta> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Renta guardar(@RequestBody Renta renta) {
        return repository.save(renta);
    }
}
