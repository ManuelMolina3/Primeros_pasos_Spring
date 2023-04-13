package com.salesianostriana.dam.e01holamundo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller//ESto determina la clase la cual es un metodo que lo que hace una gestion para una peticion
public class ControladorSaludo {
	
	@GetMapping({"/","welcome"})//cuando quiero que atienda a dos peticiones hay que poner parentesis y llave dentro del parentesis
	public String welcome (@RequestParam(name="nombre", required=false, defaultValue= "Mundo") String nombre, Model model){
		//verdaderamente solo lleva dos parametros, model es lo que le paso al controlador, @RequestPram es el parametro requerido,
		//lo que sta entre comillas es como se llama esa variable en el HTML
		model.addAttribute("nombre", nombre);
		return "index"; //es el nombre de la pagina HTML que vmos a devolver y no se opone el .HTML
		
		}
}
