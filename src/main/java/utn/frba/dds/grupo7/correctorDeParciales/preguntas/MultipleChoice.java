package utn.frba.dds.grupo7.correctorDeParciales.preguntas;

import java.util.ArrayList;

public class MultipleChoice extends PreguntaExamen {

	ArrayList<String> opciones;
	int respuestaCorrecta;
	
	int respuestaAlumno;
	
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
		super(enunciado, puntaje);
		this.opciones = opciones;
		this.respuestaCorrecta = respuestaCorrecta;
		this.respuestaAlumno = respuestaAlumno;
	}

}
