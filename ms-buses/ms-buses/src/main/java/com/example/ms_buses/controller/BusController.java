package com.example.ms_buses.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.ms_buses.model.Bus;
import com.example.ms_buses.service.BusService;

@RestController
@RequestMapping("/buses")
public class BusController {
    private final BusService service;

    public BusController(BusService service) {
        this.service = service;
    }

    @GetMapping
    public List<Bus> listar() {
        return service.listar();
    }

    @PostMapping
    public Bus guardar(@RequestBody Bus bus) {
        return service.guardar(bus);
    }

    @GetMapping("/{id}")
    public Bus buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
