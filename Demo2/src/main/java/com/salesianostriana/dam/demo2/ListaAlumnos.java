package com.salesianostriana.dam.demo2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
@Repository
public class ListaAlumnos {
	
	private List<Alumno> lista;
	@PostConstruct
	public void init () {
		
		lista =new  ArrayList <>();
		
		lista.add(
				Alumno.builder()
				.nombre("Paco")
				.apellido("Medina")
				.fechaNacimineto(LocalDate.of(2010, 4, 12))
				.build());
		
	}
	public List <Alumno> findAll (){
		return Collections.unmodifiableList(lista);
	}

}
