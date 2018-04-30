package br.com.casadocodigo.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.casadocodigo.classes.ConversorDeNumeroRomano;

public class ConversorDeNumeroRomanoTest {
	
	private ConversorDeNumeroRomano romano;
	
	@Before
	public void inicializa() {
		this.romano = new ConversorDeNumeroRomano();
	}
	
	@Test
	public void deveEntenderOSimboloI() {
		int numero = romano.converte("I");
		assertEquals(1, numero);
	}
	
	@Test
	public void deveEntenderOSimboloV() {
		int numero = romano.converte("V");
		assertEquals(5, numero);
	}
	
	@Test
	public void deveEntenderDoisSimbolosComoII() {
		int numero = romano.converte("II");
		assertEquals(2, numero);
	}

}
