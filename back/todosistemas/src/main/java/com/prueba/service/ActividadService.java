package com.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.entity.Actividad;
import com.prueba.repository.ActividadRepository;

@Service
public class ActividadService {

	

	@Autowired
	ActividadRepository actividadRepository;
	
	public List<Actividad> getAll() {
		
		List<Actividad> actividades = actividadRepository.findAll();
	
	
		return actividades;
		
	}

	public String createActividad(Actividad actividad) {
		
		actividadRepository.save(actividad);
		
		return "ok";
	}

	public String actualizarActividad(Actividad actividad) {
		
		Optional<Actividad> actividadfind = actividadRepository.findById(actividad.getId());
		
		if (actividadfind.isPresent()) {
			actividadRepository.save(actividad);
			return "ok";
		}else {
			return "no actualiza";
		}		
		
	}

	public String eliminarActividadId(int idActividad) {
		Optional<Actividad> actividadfind = actividadRepository.findById(idActividad);
		
		if (actividadfind.isPresent()) {
			actividadRepository.delete(actividadfind.get());
			return "ok";
		}else {
			return "no elimina";
		}	
	}

	
	public Optional<Actividad> getActividadId(int idActividad) {
		
		Optional<Actividad> actividad = actividadRepository.findById(idActividad);		
		
		return actividad;
	}
	
	
	
}
