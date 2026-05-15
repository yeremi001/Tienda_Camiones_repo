package com.example.ms_electronica.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_electronica.model.Electronica;
import com.example.ms_electronica.service.ElectronicaService;

@RestController
@RequestMapping("/electronica")
public class ElectronicaController {
    private final ElectronicaService service;

    public ElectronicaController(
            ElectronicaService service) {

        this.service = service;
    }

    @GetMapping
    public List<Electronica> listar() {
        return service.listar();
    }

    @PostMapping
    public Electronica guardar(
            @RequestBody Electronica electronica) {

        return service.guardar(electronica);
    }

    @GetMapping("/{id}")
    public Electronica buscar(
            @PathVariable Long id) {

        return service.buscar(id);
    }

    @PutMapping("/{id}")
    public Electronica actualizar(
            @PathVariable Long id,
            @RequestBody Electronica electronica) {

        return service.actualizar(id,
                electronica);
    }

    @DeleteMapping("/{id}")
    public void eliminar(
            @PathVariable Long id) {

        service.eliminar(id);
    }
}
