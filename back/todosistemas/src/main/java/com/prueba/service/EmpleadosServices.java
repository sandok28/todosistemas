package com.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.entity.Empleado;
import com.prueba.repository.EmpleadoRepository;

@Service
public class EmpleadosServices {

	@Autowired
	EmpleadoRepository empleadoRepository;
	
	public List<Empleado> getAll() {
		
		List<Empleado> empleados = empleadoRepository.findAll();	
		return empleados;
		
	}
	
	
	
}
