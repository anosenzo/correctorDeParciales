package utn.frba.dds.grupo7.correctorDeParciales.criterios;


public class RestarNPuntos implements CriterioParaCalculoDeNota {

	@Override
	public double calcularNota(Double puntajeTotalAlumno, Double puntajeTotalExamen) {
		
		double valorNARestar = puntajeTotalExamen - 10.0;  
		
		return puntajeTotalAlumno - valorNARestar;
	}
	
}
