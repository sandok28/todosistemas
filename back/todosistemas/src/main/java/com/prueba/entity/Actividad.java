package com.prueba.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "actividades")
public class Actividad implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idactividades")
	private Integer id;

	
	@Column(name = "nombre")
	private String nombre;

	
	@Column(name = "estado")
	private String estado;


	@Column(name = "fecha_estimada_ejecucion")
	private String fechaEstimadaEjecucion;
	
	@Column(name = "empleado_id", nullable = true)
	private String empleado_id;
	
	
	
	public String getEmpleado_id() {
		return empleado_id;
	}

	public void setEmpleado_id(String empleado_id) {
		this.empleado_id = empleado_id;
	}

	@ManyToOne(optional = true)
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;
	
	

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechaEstimadaEjecucion() {
		return fechaEstimadaEjecucion;
	}

	public void setFechaEstimadaEjecucion(String fechaEstimadaEjecucion) {
		this.fechaEstimadaEjecucion = fechaEstimadaEjecucion;
	}

}
