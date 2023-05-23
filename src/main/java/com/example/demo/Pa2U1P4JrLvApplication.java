package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U1P4JrLvApplication implements CommandLineRunner {// por primera vez hacer esto, ya que permite usar la
																	// consola

	@Autowired
	private EstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4JrLvApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Estudiante miEstudiante = new Estudiante();
		miEstudiante.setApellido("Valladares");
		miEstudiante.setCedula("1723973796");
		miEstudiante.setNombre("Luis");
		miEstudiante.setFechaNacimiento(LocalDateTime.of(1999, 2, 23, 10, 50));

		Estudiante miEstudiante1 = new Estudiante();
		miEstudiante1.setApellido("Tipan");
		miEstudiante1.setCedula("1722587496");
		miEstudiante1.setNombre("Anthony");
		miEstudiante1.setFechaNacimiento(LocalDateTime.of(2000, 2, 23, 10, 50)); // o usar localdate

		
		// 1. guardar
		this.estudianteService.guardar(miEstudiante);
		this.estudianteService.guardar(miEstudiante1);		

		// 5. ImprimirReporte
		List<Estudiante> reporte = this.estudianteService.reporteTodos();
		System.out.println("reporte de todos los estudiante ");
		for (Estudiante estu : reporte) {
			System.out.println(estu);
		}
		
		// 2. actualizar
		miEstudiante1.setApellido("Perez");
		this.estudianteService.actualizar(miEstudiante1);
		
		// 5. ImprimirReporte
		List<Estudiante> reporte2 = this.estudianteService.reporteTodos();
		System.out.println("reporte de todos los estudiante ");
		for (Estudiante estu : reporte2) {
			System.out.println(estu);
		}
		
		// 2. eliminar
		this.estudianteService.borrar("1723973796");
		// 5. ImprimirReporte
		List<Estudiante> reporte3 = this.estudianteService.reporteTodos();
		System.out.println("reporte de todos los estudiante ");
		for (Estudiante estu : reporte3) {
			System.out.println(estu);
		}
		
		
		// 3. BuscarPorCedula
		this.estudianteService.buscarPorCedula("1722587496");
	    // 5. ImprimirReporte
	    List<Estudiante> reporte4 = this.estudianteService.reporteTodos();
		System.out.println("reporte de todos los estudiante ");
		for (Estudiante estu : reporte4) {
			System.out.println(estu);
		}
		
		
		// 3. BuscarPorCedula
		System.out.println(this.estudianteService.buscarPorCedula("1722555496"));
	
		
		
	}

}
