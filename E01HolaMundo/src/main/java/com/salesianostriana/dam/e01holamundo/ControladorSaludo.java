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
		model.addAttribute("nombre", nombre);//lo que sta entre comillas es como se llama esa variable en el HTML y lo que estsa sin comillas es el valor
		return "index"; //es el nombre de la pagina HTML que vmos a devolver y no se pone el .HTML y entre comillas 
		
		}
	@GetMapping("/saludo2")
	public String welcome2(Model model) {
		model.addAttribute("persona", new Persona("Manuel", "Molina García"));
		return "saludoPersonalizado";
	}
	@GetMapping ("/saludo3")
	public String welcome3(Model model) {
	model.addAttribute("saludo", "Hola Mundo");/*Variable tipo text normal*/
	model.addAttribute("mensaje", "¡Se me está haciendo largo el proyecto final!");
	model.addAttribute("url", "https://triana.salesianos.edu");/*devolvemos una url*/
	return "saludoYEnlace";
	}
}
