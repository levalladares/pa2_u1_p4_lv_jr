package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	
	public void guardar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	// buscamos por un identificador
	public Estudiante buscarPorCedula(String cedula);

	// eliminamos por un identificador
	public void borrar(String cedula);
	
	public List<Estudiante> reporteTodos();


}
