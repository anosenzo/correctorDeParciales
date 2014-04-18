package utn.frba.dds.grupo7.correctorDeParciales.criterios;

import java.util.HashSet;


public class NotaPromedioDeLosCriterios implements CriterioParaCalculoDeNota {

	HashSet<CriterioParaCalculoDeNota> criterios = new HashSet<CriterioParaCalculoDeNota>();
	
	@Override
	public double calcularNota(Double puntajeTotalAlumno, Double puntajeTotalExamen) {
		
		return  criterios.stream()
						.mapToDouble( criterio -> criterio.calcularNota(puntajeTotalAlumno, puntajeTotalExamen) )
						.average()
						// .getAsDouble() Probar tambien esta opcion!! 
						.orElse(0.0);
				
	}

}
