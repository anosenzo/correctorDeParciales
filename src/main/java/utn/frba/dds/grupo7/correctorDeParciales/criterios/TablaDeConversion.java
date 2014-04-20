package utn.frba.dds.grupo7.correctorDeParciales.criterios;

import java.util.HashMap;


public class TablaDeConversion implements CriterioParaCalculoDeNota {

	HashMap<Double,Double> tablaConversionPuntaje; 
	
	@Override
	public double calcularNota(Double puntajeTotalAlumno, Double puntajeTotalExamen) {
		
		if(tablaConversionPuntaje.containsKey(puntajeTotalAlumno))
			return tablaConversionPuntaje.get(puntajeTotalAlumno);
		else
			throw new PuntajeTotalAlumnoNoEncontradoEnTablaDeConversion("No se encontro el valor "
						+ puntajeTotalAlumno + " en la tabla de conversion");
		
		
	}
	
	public TablaDeConversion(HashMap<Double,Double> tablaConversionPuntaje){
		this.tablaConversionPuntaje = tablaConversionPuntaje;
	}

}
