package com.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.entity.Empleado;
import com.prueba.service.EmpleadosServices;

@CrossOrigin("*")
@RestController  
@RequestMapping("/empleados")
public class EmpleadosController {
	
	@Autowired
	EmpleadosServices empleadoService;
	
	
	@GetMapping
	public List<Empleado> getAll() {
				
		
		return empleadoService.getAll();
	}

}
