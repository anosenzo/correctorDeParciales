package utn.frba.dds.grupo7.correctorDeParciales.tests;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import utn.frba.dds.grupo7.correctorDeParciales.preguntas.MultipleChoice;
import utn.frba.dds.grupo7.correctorDeParciales.preguntas.PreguntaConcreta;
import utn.frba.dds.grupo7.correctorDeParciales.preguntas.VerdaderoFalso;

public class PreguntaExamenTest {

	@Before
	public void setUp() throws Exception {
	}

	// Son al re dope solo testeo si INT == INT o STRING == STRING o Boolean == Boolean
	// y un getter damePuntaje() solo los hago para practicar
	
	@Test
	public void verdaderoOFalsoEsCorrectaDevuelveVerdaderoCuandoCoincidenRespuestaAlumnoYRespuestaCorrecta() {
		VerdaderoFalso verdaderoFalso =  new VerdaderoFalso("2 + 2 = 4", true, true, 2);
		Assert.assertTrue(verdaderoFalso.esCorrecta());
	}
	
	@Test
	public void multipleChoiceEsCorrectaDevuelveVerdaderoCuandoCoincidenRespuestaAlumnoYRespuestaCorrecta() {
		ArrayList<String> opciones = new ArrayList<String>( Arrays.asList("0","2","3","4","5") );
		MultipleChoice multipleChoice =  new MultipleChoice("2 + 2 es", opciones, 4, 4, 2);
		Assert.assertTrue(multipleChoice.esCorrecta());
	}
	
	@Test
	public void preguntaCorrectaEsCorrectaDevuelveVerdaderoCuandoCoincidenRespuestaAlumnoYRespuestaCorrecta() {
		PreguntaConcreta preguntaConcreta = new PreguntaConcreta("De que color es el caballo blanco de San Martin",
																	"blanco", "blanco", 2);
		Assert.assertTrue(preguntaConcreta.esCorrecta());
	}
	

}
