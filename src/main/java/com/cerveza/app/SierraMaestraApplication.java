package com.cerveza.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cerveza.app.entidad.Barril;
import com.cerveza.app.repositorio.BarrilRepositorio;

@SpringBootApplication
public class SierraMaestraApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SierraMaestraApplication.class, args);
	}
	
	@Autowired
	private BarrilRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
