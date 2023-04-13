package com.salesianostriana.dam.demo2;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
@Repository
@Primary
public class AlmacenAlumnosArray implements AlmacenAlumnos {

	@Override
	public List<Alumno> findAll() {
		Alumno[] lista = new Alumno[] {
				
		};
		return Arrays.asList(lista);
	}

}
