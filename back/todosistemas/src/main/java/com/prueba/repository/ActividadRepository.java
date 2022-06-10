package com.prueba.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.entity.Actividad;
import com.prueba.entity.Empleado;

@Repository
public interface ActividadRepository  extends JpaRepository<Actividad,Integer>{
	
}
