package utn.frba.dds.grupo7.correctorDeParciales.criterios;

import java.util.HashMap;


public class TablaDeConversion implements CriterioParaCalculoDeNota {

	HashMap<Integer,Integer> tablaConversionPuntaje = new HashMap<Integer,Integer>(); 
	
	@Override
	public double calcularNota(Double puntajeTotalAlumno, Double puntajeTotalExamen) {
		
		return tablaConversionPuntaje.get(puntajeTotalAlumno);
	}

}
