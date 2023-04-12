package com.salesianostriana.dam.demo2;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
	
public class Alumno {
	private String nombre, apellido;
	private LocalDate fechaNacimineto;
}
