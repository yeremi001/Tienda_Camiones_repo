package com.example.ms_camiones.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_camiones.model.Camion;
import com.example.ms_camiones.service.CamionService;

@RestController
@RequestMapping("/camiones")
public class CamionController {
    private final CamionService service;

    public CamionController(CamionService service) {
        this.service = service;
    }

    @GetMapping
    public List<Camion> listar() {
        return service.listar();
    }

    @PostMapping
    public Camion guardar(@RequestBody Camion camion) {
        return service.guardar(camion);
    }

    @GetMapping("/{id}")
    public Camion buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
