package utn.frba.dds.grupo7.correctorDeParciales.preguntas;

public abstract class PreguntaExamen {

	String enunciado;
	double puntaje;
	
	public abstract boolean esCorrecta();

	public double damePuntaje() {
		return this.puntaje;
	}
	
	protected PreguntaExamen(String enunciado, double puntaje){
		this.enunciado = enunciado;
		this.puntaje = puntaje;
	}
}