package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteRepository {
	public void insertar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	// buscamos por un identificador
	public Estudiante seleccionar(String cedula);

	// eliminamos por un identificador
	public void eliminar(String cedula);
	
	public List<Estudiante> seleccionarTodos();
}
