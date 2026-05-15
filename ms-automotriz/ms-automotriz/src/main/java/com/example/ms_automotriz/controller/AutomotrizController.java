package com.example.ms_automotriz.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_automotriz.model.Automotriz;
import com.example.ms_automotriz.service.AutomotrizService;

@RestController
@RequestMapping("/automotrices")
public class AutomotrizController {
    private final AutomotrizService service;

    public AutomotrizController(AutomotrizService service) {
        this.service = service;
    }

    @GetMapping
    public List<Automotriz> listar() {
        return service.listar();
    }

    @PostMapping
    public Automotriz guardar(
            @RequestBody Automotriz automotriz) {

        return service.guardar(automotriz);
    }

    @GetMapping("/{id}")
    public Automotriz buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PutMapping("/{id}")
    public Automotriz actualizar(
            @PathVariable Long id,
            @RequestBody Automotriz automotriz) {

        return service.actualizar(id, automotriz);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
