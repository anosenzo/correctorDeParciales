package utn.frba.dds.grupo7.correctorDeParciales;

import java.util.HashSet;

import utn.frba.dds.grupo7.correctorDeParciales.criterios.CriterioParaCalculoDeNota;
import utn.frba.dds.grupo7.correctorDeParciales.preguntas.PreguntaExamen;

public class Examen {
	
	HashSet<PreguntaExamen> preguntas = new HashSet<PreguntaExamen>();
	CriterioParaCalculoDeNota criterio;
	
	public double obtenerNota(){
		return this.criterio.calcularNota( this.calcularPuntajeTotalAlumno(), 
										   this.calcularPuntajeTotalExamen() );
	}
	
	private double calcularPuntajeTotalAlumno(){
		
		return preguntas.stream()
						.filter( PreguntaExamen::esCorrecta )
						.mapToDouble( PreguntaExamen::damePuntaje )
						.sum();
		
	}
	
	private double calcularPuntajeTotalExamen(){
		
		return preguntas.stream()
						.mapToDouble( PreguntaExamen::damePuntaje )
						.sum();
		
	}
	
	
}
