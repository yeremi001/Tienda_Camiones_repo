package com.example.ms_buses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ms_buses.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {

}
