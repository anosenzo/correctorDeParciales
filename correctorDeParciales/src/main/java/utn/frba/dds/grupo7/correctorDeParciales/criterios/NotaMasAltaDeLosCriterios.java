package utn.frba.dds.grupo7.correctorDeParciales.criterios;

import java.util.HashSet;


public class NotaMasAltaDeLosCriterios implements CriterioParaCalculoDeNota {

	HashSet<CriterioParaCalculoDeNota> criterios = new HashSet<CriterioParaCalculoDeNota>();
	
	@Override
	public double calcularNota(Double puntajeTotalAlumno, Double puntajeTotalExamen) {
		
		return (double) criterios.stream()
						.mapToDouble( criterio -> criterio.calcularNota(puntajeTotalAlumno, puntajeTotalExamen) )
						.max()
					    // .getAsDouble() Probar tambien esta opcion!! 
						.orElse(0.0);
	}

}
