package utn.frba.dds.grupo7.correctorDeParciales.preguntas;

import java.util.ArrayList;

public class PreguntaConcreta extends PreguntaExamen {

	String respuestaCorrecta;

	String respuestaAlumno;

	@Override
	public boolean esCorrecta() {
		return this.respuestaCorrecta == this.respuestaAlumno;
	}

	@Override
	public double damePuntaje() {
		return this.puntaje;
	}

	public PreguntaConcreta(String enunciado, String respuestaCorrecta,
			String respuestaAlumno, double puntaje) {
		
		super(enunciado, puntaje);
		
		this.respuestaCorrecta = respuestaCorrecta;
		this.respuestaAlumno = respuestaAlumno;
	}
}
