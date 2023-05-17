package com.example.demo;

public class MatriculaCalculo {
	public void RealizarMatricula(String tipo) {
		if(tipo.equals("1")) {
			Materia mat = new Materia();
			mat.setNombre("P.web");
			//insertar en la base
			System.out.println("se inserto materia");
		}else {
			MateriaExtraordinaria matX=new MateriaExtraordinaria();
			matX.setNombre("p,web");
			matX.setXantidadCreditos(10);
			//insertar en la base
			System.out.println("se inserto materia extraordinaria");
		}

	}

}
