package utn.frba.dds.grupo7.correctorDeParciales.criterios;


public class RestarNPuntos implements CriterioParaCalculoDeNota {

	@Override
	public double calcularNota(Double puntajeTotalAlumno, Double puntajeTotalExamen) {
		
		double valorNARestar = puntajeTotalExamen - 10.0;  
		
		double notaAlumno = puntajeTotalAlumno - valorNARestar;
		
		if(notaAlumno > 0.0)
			return notaAlumno;
		else
			return 0.0;	
		
	}
	
}
