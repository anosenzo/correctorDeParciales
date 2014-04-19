package utn.frba.dds.grupo7.correctorDeParciales.tests;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import utn.frba.dds.grupo7.correctorDeParciales.criterios.ReglaDe3Simple;
import utn.frba.dds.grupo7.correctorDeParciales.criterios.RestarNPuntos;
import utn.frba.dds.grupo7.correctorDeParciales.criterios.TablaDeConversion;

public class CriterioParaCalculoDeNotaTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void ReglaDe3SimpleCuandoTotalDePuntosEs16YElAlumnoSaco14DevuelveUnaNotaDe8_75() {
		ReglaDe3Simple regla3Simple = new ReglaDe3Simple();
		assertEquals(8.75, regla3Simple.calcularNota(14.0, 16.0), 0.01);
	}

	@Test
	public void ReglaDe3SimpleCuandoTotalDePuntosEs16YElAlumnoSaco0DevuelveUnaNotaDe0() {
		ReglaDe3Simple regla3Simple = new ReglaDe3Simple();
		assertEquals(0.0, regla3Simple.calcularNota(0.0, 16.0), 0.01);
	}
	
	@Test
	public void RestarNPuntosCuandoTotalDePuntosEs16YElAlumnoSaco14DevuelveUnaNotaDe8() {
		RestarNPuntos restarNpuntos = new RestarNPuntos();
		assertEquals(8.00, restarNpuntos.calcularNota(14.0, 16.0), 0.01);
	}
	
	@Test
	public void RestarNPuntosCuandoTotalDePuntosEs16YElAlumnoSaco0DevuelveUnaNotaDe0() {
		RestarNPuntos restarNpuntos = new RestarNPuntos();
		assertEquals(0.00, restarNpuntos.calcularNota(0.0, 16.0), 0.01);
	}

	@Test
	public void TablaDeConversionCuandoElAlumnoSaco14YAl14LeCorresponde8Devuelve8() {
		HashMap<Integer,Integer> tablaPuntajeNota = new HashMap<Integer,Integer>();
		tablaPuntajeNota.put(16, 10);
		tablaPuntajeNota.put(14, 8);
		TablaDeConversion tablaConversion = new TablaDeConversion(tablaPuntajeNota);
		assertEquals(8.00, tablaConversion.calcularNota(14.0, 16.0), 0.01);
	}
	
//	@Test(expected = PuntajeTotalAlumnoNoEncontradoEnTablaDeConversion.class)
//	public void TablaDeConversionCuandoElAlumnoSaco15YAl15NoTieneNotaCorrespondienteLanzaExcepcionNotaNoCargadaEnTablaDeConversion() {
//		HashMap<Integer,Integer> tablaPuntajeNota = new HashMap<Integer,Integer>();
//		tablaPuntajeNota.put(16, 10);
//		tablaPuntajeNota.put(14, 8);
//		TablaDeConversion tablaConversion = new TablaDeConversion(tablaPuntajeNota);
//		tablaConversion.calcularNota(14.0, 16.0);
//	}
	
}
