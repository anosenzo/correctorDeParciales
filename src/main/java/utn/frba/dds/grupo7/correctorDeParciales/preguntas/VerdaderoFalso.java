package utn.frba.dds.grupo7.correctorDeParciales.preguntas;


public class VerdaderoFalso implements PreguntaExamen {
	
	String enunciado;
	boolean respuestaCorrecta;
	
	boolean respuestaAlumno;
	double puntaje;
	
	@Override
	public boolean esCorrecta() {
		return this.respuestaCorrecta == this.respuestaAlumno;
	}

	@Override
	public double damePuntaje() {
		return this.puntaje;
	}
	
	public VerdaderoFalso(String enunciado, boolean respuestaCorrecta, boolean respuestaAlumno, 
								double puntaje){
		this.enunciado = enunciado;
		this.respuestaCorrecta = respuestaCorrecta;
		this.respuestaAlumno = respuestaAlumno;
		this.puntaje = puntaje;
	} 

}
