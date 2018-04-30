package br.com.casadocodigo.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.casadocodigo.classes.Calculadora;

public class CalculadoraTest {
	
	private Calculadora calculadora;
	
	@Before
	public void inicializa() {
		this.calculadora = new Calculadora();
	}
	
	@Test
	public void deveSomar1Com1() {
		assertEquals(2, calculadora.soma(1, 1));
	}
	
	@Test
	public void deveSomarVariosValores() {
		assertEquals(15, calculadora.soma(1, 2, 3, 4, 5));
	}
	
	@Test
	public void deveCalcularFatorial5() {
		assertEquals(120, calculadora.fatorial(5));
	}

}
