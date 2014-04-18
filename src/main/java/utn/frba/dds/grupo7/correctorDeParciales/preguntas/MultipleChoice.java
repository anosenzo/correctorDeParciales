package utn.frba.dds.grupo7.correctorDeParciales.preguntas;

import java.util.ArrayList;

public class MultipleChoice implements PreguntaExamen {

	String enunciado;
	ArrayList<String> opciones;
	int respuestaCorrecta;
	
	int respuestaAlumno;
	double puntaje;
	
	@Override
	public boolean esCorrecta() {
		return this.respuestaCorrecta == this.respuestaAlumno;
	}

	@Override
	public double damePuntaje() {
		return this.puntaje;
	}
	
	public MultipleChoice(String enunciado, ArrayList<String> opciones, int respuestaCorrecta, 
							int respuestaAlumno, double puntaje){
		this.enunciado = enunciado;
		this.opciones = opciones;
		this.respuestaCorrecta = respuestaCorrecta;
		this.respuestaAlumno = respuestaAlumno;
		this.puntaje = puntaje;
	}

}
