package com.salesianostriana.dam.demo2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class ServicioAlumnos {
	@Autowired 
	@Qualifier("almacenAlumnosEnArray")
	private AlmacenAlumnos lista;

	public List <String> cumpleHoy (){
		List<String> result = new ArrayList <>();
		result= lista.findAll().stream()
		.filter(a -> a.getFechaNacimineto().getDayOfMonth()== 
							LocalDate.now().getDayOfMonth()&&
							a.getFechaNacimineto().getMonth()== 
							LocalDate.now().getMonth())
		.map(a -> a.getNombre()+ " " + a.getApellido())
		.toList();
		return result;
	}
}
