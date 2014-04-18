package utn.frba.dds.grupo7.correctorDeParciales.criterios;


public class ReglaDe3Simple implements CriterioParaCalculoDeNota {

	@Override
	public double calcularNota(Double puntajeTotalAlumno, Double puntajeTotalExamen) {
		
		return puntajeTotalAlumno * 10 / puntajeTotalExamen;
	}

}
