package utn.frba.dds.grupo7.correctorDeParciales.preguntas;

import java.util.ArrayList;

public class PreguntaConcreta implements PreguntaExamen {

	String enunciado;
	String respuestaCorrecta;

	String respuestaAlumno;
	double puntaje;

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
		this.enunciado = enunciado;
		this.respuestaCorrecta = respuestaCorrecta;
		this.respuestaAlumno = respuestaAlumno;
		this.puntaje = puntaje;
	}
}
