package com.cerveza.app.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cerveza.app.entidad.Barril;
import com.cerveza.app.servicio.BarrileServicio;

@Controller
public class BarrilControlador {

	@Autowired
	private BarrileServicio servicio;

	@GetMapping("/barril")
	public String listarBarriles(Model modelo) {
		modelo.addAttribute("barril", servicio.listarTodosLosBarriles());
		return "index";

	}

	@GetMapping("/barril/nuevo")
	public String crearBarrilFormulario(Model modelo) {
	    Barril barril = new Barril();
	    modelo.addAttribute("barril", barril);
	    
	    modelo.addAttribute("estados", new String[]{"Cargado", "Alquilado", "Devuelto", "Limpio", "Inactivo"});
	    
	    return "crear_barril";
	}

	@PostMapping("/barril")
	public String guardarBarril(@ModelAttribute("barril") Barril barril) {
		servicio.guardarBarril(barril);
		return "redirect:/barril";
	}

	@GetMapping("/barril/editarBarril/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("barril", servicio.obtenerBarrilPorId(id));
		
		modelo.addAttribute("estados", new String[]{"Cargado", "Alquilado", "Devuelto", "Limpio", "Inactivo"});
		
		
		return "editar_barril";
	}

	@PostMapping("/barril/{id}")
	public String actualizarBarril(@PathVariable Long id, @ModelAttribute("barril") Barril barril, Model modelo) {
		Barril barrilExistente = servicio.obtenerBarrilPorId(id);
		barrilExistente.setId(id);
		barrilExistente.setLitros(barril.getLitros());
		barrilExistente.setEstado(barril.getEstado());
		barrilExistente.setNotas(barril.getNotas());
		servicio.actualizarBarril(barrilExistente);
		return "redirect:/barril";
	}

	@GetMapping("/barril/{id}")
	public String EliminarBarril(@PathVariable Long id) {
		servicio.eliminarBarril(id);
		return "redirect:/barril";
	}
	
	@GetMapping("/barril/showBarril/{id}")
	public String obtenerBarrilPorId(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("barril", servicio.obtenerBarrilPorId(id));
		return "show_barril";
	}
}
