package utn.frba.dds.grupo7.correctorDeParciales.tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import utn.frba.dds.grupo7.correctorDeParciales.criterios.*;
import utn.frba.dds.grupo7.correctorDeParciales.criterios.NotaMasAltaDeLosCriterios;
import utn.frba.dds.grupo7.correctorDeParciales.criterios.NotaPromedioDeLosCriterios;

public class CriteriosQueBasanSuNotaEnOtrosCriteriosTest {

	CriterioParaCalculoDeNota criterioNota7;
	CriterioParaCalculoDeNota criterioNota8;
	CriterioParaCalculoDeNota criterioNota9;
	
	CriterioParaCalculoDeNota criterioNotaDevuelve0_a;
	CriterioParaCalculoDeNota criterioNotaDevuelve0_b;
	CriterioParaCalculoDeNota criterioNotaDevuelve0_c;
	
	@Before
	public void setUp() throws Exception {
		
		this.criterioNota7 = mock(NotaMasAltaDeLosCriterios.class);
		doReturn(7.0).when(this.criterioNota7).calcularNota(14.0, 16.0);
		
		this.criterioNota8 = mock(NotaMasAltaDeLosCriterios.class);
		doReturn(8.0).when(this.criterioNota8).calcularNota(14.0, 16.0);
		
		this.criterioNota9 = mock(NotaMasAltaDeLosCriterios.class);
		doReturn(9.0).when(this.criterioNota9).calcularNota(14.0, 16.0);
		
		this.criterioNotaDevuelve0_a = mock(NotaMasAltaDeLosCriterios.class);
		doReturn(0.0).when(this.criterioNotaDevuelve0_a).calcularNota(0.0, 16.0);
		
		this.criterioNotaDevuelve0_b = mock(NotaMasAltaDeLosCriterios.class);
		doReturn(0.0).when(this.criterioNotaDevuelve0_b).calcularNota(0.0, 16.0);
		
		this.criterioNotaDevuelve0_c = mock(NotaMasAltaDeLosCriterios.class);
		doReturn(0.0).when(this.criterioNotaDevuelve0_c).calcularNota(0.0, 16.0);
	}
	
	@Test
	public void criterioNotaMasAltaDeLosCriteriosSiRecibeLasNotas7_8_9DevuelveLaNota9(){		
		
		NotaMasAltaDeLosCriterios criterioNotaMasAlta = new NotaMasAltaDeLosCriterios();
		
		criterioNotaMasAlta.agregarCriterio(this.criterioNota7);
		criterioNotaMasAlta.agregarCriterio(this.criterioNota8);
		criterioNotaMasAlta.agregarCriterio(this.criterioNota9);
		
		assertEquals(9.00, criterioNotaMasAlta.calcularNota(14.0, 16.0), 0.01);
	}
	
	@Test
	public void criterioNotaMasAltaDeLosCriteriosSiRecibeLasNotas0_0_0DevuelveLaNota0(){
		
		NotaMasAltaDeLosCriterios criterioNotaMasAlta = new NotaMasAltaDeLosCriterios();
		
		criterioNotaMasAlta.agregarCriterio(this.criterioNotaDevuelve0_a);
		criterioNotaMasAlta.agregarCriterio(this.criterioNotaDevuelve0_b);
		criterioNotaMasAlta.agregarCriterio(this.criterioNotaDevuelve0_c);
		
		assertEquals(0.00, criterioNotaMasAlta.calcularNota(0.0, 16.0), 0.01);
	}
	
	@Test
	public void criterioPromedioDeLosCriteriosSiRecibeLasNotas7_8_9DevuelveLaNota8(){
		
		NotaPromedioDeLosCriterios criterioNotaPromedio = new NotaPromedioDeLosCriterios();
		
		criterioNotaPromedio.agregarCriterio(this.criterioNota7);
		criterioNotaPromedio.agregarCriterio(this.criterioNota8);
		criterioNotaPromedio.agregarCriterio(this.criterioNota9);
		
		assertEquals(8.00, criterioNotaPromedio.calcularNota(14.0, 16.0), 0.01);
	}
	
	@Test
	public void criterioPromedioDeLosCriteriosSiRecibeLasNotas0_0_0DevuelveLaNota0(){
		
		NotaPromedioDeLosCriterios criterioNotaPromedio = new NotaPromedioDeLosCriterios();
		
		criterioNotaPromedio.agregarCriterio(this.criterioNotaDevuelve0_a);
		criterioNotaPromedio.agregarCriterio(this.criterioNotaDevuelve0_b);
		criterioNotaPromedio.agregarCriterio(this.criterioNotaDevuelve0_c);
		
		assertEquals(0.00, criterioNotaPromedio.calcularNota(0.0, 16.0), 0.01);
	}
	
	

}
