package utn.frba.dds.grupo7.correctorDeParciales.tests;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import utn.frba.dds.grupo7.correctorDeParciales.Examen;
import utn.frba.dds.grupo7.correctorDeParciales.criterios.CriterioParaCalculoDeNota;
import utn.frba.dds.grupo7.correctorDeParciales.preguntas.PreguntaExamen;

public class ExamenTest {

	PreguntaExamen preguntaVale4;
	PreguntaExamen preguntaVale5;
	PreguntaExamen preguntaVale3;
	HashSet<PreguntaExamen> preguntas;
	CriterioParaCalculoDeNota criterio;
	
	@Before
	public void setUp() throws Exception {
		
		this.preguntaVale4 = mock(PreguntaExamen.class);
		doReturn(4.0).when(this.preguntaVale4).damePuntaje();
		
		this.preguntaVale5 = mock(PreguntaExamen.class);
		doReturn(5.0).when(this.preguntaVale5).damePuntaje();
		
		this.preguntaVale3 = mock(PreguntaExamen.class);
		doReturn(3.0).when(this.preguntaVale3).damePuntaje();
		
		preguntas = new HashSet<PreguntaExamen>();
		preguntas.add(this.preguntaVale4);
		preguntas.add(this.preguntaVale5);
		preguntas.add(this.preguntaVale3);
		
		this.criterio = mock(CriterioParaCalculoDeNota.class);
		
	}

	@Test
	public void obtenerNotaDelExamenCuandoElPuntajeDelAlumnoEs7YElTotalDelExamenEs12Devuelve8(){
		
		Examen examen = new Examen(preguntas, this.criterio);
		
		doReturn(true).when(this.preguntaVale4).esCorrecta();
		doReturn(false).when(this.preguntaVale5).esCorrecta();
		doReturn(true).when(this.preguntaVale3).esCorrecta();
		
		doReturn(8.0).when(this.criterio).calcularNota(7.0, 12.0);
		
		assertEquals(8.0, examen.obtenerNota(), 0.01);
		
	}
	
	@Test
	public void obtenerNotaDelExamenCuandoElPuntajeDelAlumnoEs0YElTotalDelExamenEs12Devuelve0(){
		
		Examen examen = new Examen(this.preguntas, this.criterio);
		
		doReturn(false).when(this.preguntaVale4).esCorrecta();
		doReturn(false).when(this.preguntaVale5).esCorrecta();
		doReturn(false).when(this.preguntaVale3).esCorrecta();
		
		// No le pongo 0 en el doReturn porque el default de mockito es 0.0 para los doubles
		doReturn(1.0).when(this.criterio).calcularNota(0.0, 12.0);
		
		assertEquals(1.0, examen.obtenerNota(), 0.01);
		
	}
	
	// Seria mejor que muestre una excepcion
	@Test 
	public void obtenerNotaDelExamenCuandoNoHayNingunaPreguntaCargadaDevuelveUnaExcepcionExamenSinNingunaPreguntaCargada(){

		HashSet<PreguntaExamen> ColeccionSinPreguntas = new HashSet<PreguntaExamen>();
		
		Examen examen = new Examen(ColeccionSinPreguntas, this.criterio);
		
		doReturn(1.0).when(this.criterio).calcularNota(0.0, 0.0);
		
		assertEquals(1.0, examen.obtenerNota(), 0.01);
		
	}
	
	//	No vale la pena probar los metodos privados porque ya estan cubiertos al testear el metodo Public
	//	ObtenerNota() y no tienen una complejidad tal que valga usar tecnicas como reflection para testearlos 
	//  individualmente
	
//	@Test
//	public void calcularPuntajeTotalDelExamenCuandoLasPreguntasValen_4_5_3_YsonCorrectasDevuelve12() {
//		
//		doReturn(true).when(preguntaVale4).esCorrecta();
//		this.examen.agregarPregunta(this.preguntaVale4);
//		
//		doReturn(true).when(preguntaVale5).esCorrecta();
//		this.examen.agregarPregunta(this.preguntaVale5);
//		
//		doReturn(true).when(preguntaVale3).esCorrecta();
//		this.examen.agregarPregunta(this.preguntaVale3);
//		
//		assertEquals(12.0, this.examen.calcular, 0.01);
//		
//	}
//	
//	@Test
//	public void calcularPuntajeTotalDelExamenCuandoNoTienePreguntasCargadasDevuelve0() {
//		
//		assertEquals(0.0, this.examen.calcular, 0.01);
//		
//	}
//	  
//	@Test
//	public void calcularPuntajeTotalDelAlumnoCuandoLasPreguntasValen_4_5_3_YLaSegundaEsIncorrectaDevuelve8(){
//		
//	} 
//	
//	// Seria mejor que lance una excepción en vez de devolver 0
//	@Test
//	public void calcularPuntajeTotalDelAlumnoCuandoLasPreguntasValen_4_5_3_YSonTodasIncorrectasDevuelve0(){
//		
//	}
//	
//	// Seria mejor que lance una excepción en vez de devolver 0
//	@Test
//	public void calcularPuntajeTotalDelAlumnoCuandoNoTienePreguntasCargadasDevuelve0(){
//		
//	}
//	
}
