package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

@Repository
public class EstudianteRepositoryImpl1 implements EstudianteRepository  {

	private static List<Estudiante> baseDatos= new ArrayList<>();
	
	@Override
	public void insertar(Estudiante estudiante) {
		baseDatos.add(estudiante);
		
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.eliminar(estudiante.getCedula());
		this.insertar(estudiante);
		
	}
	
	@Override
	public Estudiante seleccionar(String cedula) {
		Estudiante estuEncontrado=new Estudiante();
		for(Estudiante estu: baseDatos){
			if(cedula.equals(estu.getCedula())) //evaluar con el elemento que no esta vacio
			estuEncontrado= estu;	
		}
		return estuEncontrado; //un metodo no debe tener dos returns
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Estudiante estu= this.seleccionar(cedula);
		baseDatos.remove(estu);
	}

	@Override
	public List<Estudiante> seleccionarTodos() {
		return baseDatos;
	}
	
}
