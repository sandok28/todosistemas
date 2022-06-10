package com.prueba.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.entity.Actividad;
import com.prueba.service.ActividadService;

@CrossOrigin("*")
@RestController 
@RequestMapping("/actividades")
public class ActividadesController {

	
	@Autowired
	ActividadService actividadService;
	
	
	@GetMapping
	public List<Actividad> getAll() {				
		return actividadService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Actividad> getActividadId(@PathVariable("id") int idActividad) {
				
		return actividadService.getActividadId(idActividad);
	}
	
	
	@PostMapping
	public String createActividad(@RequestBody Actividad actividad) {
		return actividadService.createActividad(actividad);
	}
	
	@PutMapping()
	public String actualizarActividad(@RequestBody Actividad actividad) {	
		return actividadService.actualizarActividad(actividad);	
	}
	
	
	@DeleteMapping("/{id}")
	public String eliminarActividadId(@PathVariable("id") int idActividad) {		
			return actividadService.eliminarActividadId(idActividad);		
	}
	
}
