package com.salesianostriana.dam.demo2;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainDeMentira {
	@Autowired
	private ServicioAlumnos servicioAlumnos;

	@PostConstruct
	public void ejecutar() {
		servicioAlumnos.cumpleHoy().forEach(a -> System.out.println("Felicidades" + a));
	}
}
