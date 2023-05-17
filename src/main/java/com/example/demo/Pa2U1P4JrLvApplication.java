package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P4JrLvApplication implements CommandLineRunner{
	@Autowired  //PARA INYECTAR EL OBJETO
	private Profesor profe2; 

	public static void main(String[] args) {
	 SpringApplication.run(Pa2U1P4JrLvApplication.class, args);
	}
	public void run(String... args) throws Exception {
	 System.out.println("Mi primer proyecto");
	 Profesor profe = new Profesor ();
	 profe.setApellido("Valladare");
	 profe.setCedula("1726787425");
	 profe.setFechaNacimiento(LocalDateTime.now());
	 profe.setNombre("Anthony");
	 System.out.println(profe);
	 System.out.println(profe.getApellido());
	 
	 System.out.println(profe2);
	 System.out.println(profe2.getApellido());
	 
	 Profesor profe3 = new Profesor ();
	 profe3=profe;
	 System.out.println(profe3);
	 profe.setApellido("Valladares");
	 System.out.println(profe3);
	 
	 MatriculaCalculo mat = new MatriculaCalculo();
	 mat.RealizarMatricula("1");
	}

}
