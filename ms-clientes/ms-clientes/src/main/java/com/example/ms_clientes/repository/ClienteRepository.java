package com.example.ms_clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ms_clientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
