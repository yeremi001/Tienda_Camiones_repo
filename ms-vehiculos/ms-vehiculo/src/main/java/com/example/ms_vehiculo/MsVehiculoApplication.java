package com.example.ms_vehiculo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class MsVehiculoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsVehiculoApplication.class, args);
	}

}
