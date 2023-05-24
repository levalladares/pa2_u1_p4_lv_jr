package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Transferencia;
import com.example.demo.repository.modelo.Estudiante;

@Repository
public class TransferenciaRepositoryImpl implements TransferenciaRepository{

	private static List<Transferencia> baseDatos= new ArrayList<>();
	
	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		baseDatos.add(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.eliminar(transferencia.getNumero());
		this.insertar(transferencia);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		Transferencia transfer= this.seleccionarPorNumero(numero);
		baseDatos.remove(transfer);
		
	}

	@Override
	public Transferencia seleccionarPorNumero(String numero) {
		// TODO Auto-generated method stub
		Transferencia transEncontrado=new Transferencia();
		for(Transferencia trans: baseDatos){
			if(numero.equals(trans.getNumero())) //evaluar con el elemento que no esta vacio
			transEncontrado= trans;	
		}
		return transEncontrado; //un metodo no debe tener dos returns
	
	}

}
