package utn.frba.dds.grupo7.correctorDeParciales.preguntas;


public class VerdaderoFalso extends PreguntaExamen {
	
	boolean respuestaCorrecta;
	
	boolean respuestaAlumno;
	
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
	
		super(enunciado, puntaje);
		
		this.respuestaCorrecta = respuestaCorrecta;
		this.respuestaAlumno = respuestaAlumno;
		
	} 

}
