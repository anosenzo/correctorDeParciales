package utn.frba.dds.grupo7.correctorDeParciales.criterios;

import java.util.HashMap;


public class TablaDeConversion implements CriterioParaCalculoDeNota {

	HashMap<Integer,Integer> tablaConversionPuntaje; 
	
	@Override
	public double calcularNota(Double puntajeTotalAlumno, Double puntajeTotalExamen) {
		
		if(tablaConversionPuntaje.containsKey(puntajeTotalAlumno))
			return tablaConversionPuntaje.get(puntajeTotalAlumno);
		else
			throw new PuntajeTotalAlumnoNoEncontradoEnTablaDeConversion("No se encontro el valor "
						+ puntajeTotalAlumno + " en la tabla de conversion");
		
		
	}
	
	public TablaDeConversion(HashMap<Integer,Integer> tablaConversionPuntaje){
		this.tablaConversionPuntaje = tablaConversionPuntaje;
	}

}
