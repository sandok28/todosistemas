package com.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prueba.entity.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado,Integer>{
	
	

}
