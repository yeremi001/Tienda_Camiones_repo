package com.example.ms_vehiculo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.ms_vehiculo.dto.ApiResponse;
import com.example.ms_vehiculo.model.Vehiculo;
import com.example.ms_vehiculo.service.VehiculoService;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoCntroller {
        private VehiculoService service;

    public void VehiculoController(VehiculoService service) {
        this.service = service;
    }

    @GetMapping
    public ApiResponse<List<Vehiculo>> listar() {
        return new ApiResponse<>("Lista de vehiculos", service.listar());
    }

    @PostMapping
    public ApiResponse<Vehiculo> guardar(@RequestBody Vehiculo vehiculo) {
        return new ApiResponse<>("Vehiculo guardado", service.guardar(vehiculo));
    }

    @GetMapping("/{id}")
    public ApiResponse<Vehiculo> buscar(@PathVariable Long id) {
        return new ApiResponse<>("Vehiculo encontrado", service.buscar(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<Vehiculo> actualizar(@PathVariable Long id,
                                            @RequestBody Vehiculo vehiculo) {

        return new ApiResponse<>("Vehiculo actualizado",
                service.actualizar(id, vehiculo));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<String> eliminar(@PathVariable Long id) {

        service.eliminar(id);

        return new ApiResponse<>("Vehiculo eliminado", "OK");
    }
}
