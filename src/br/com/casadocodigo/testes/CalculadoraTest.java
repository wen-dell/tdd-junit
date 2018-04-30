package br.com.casadocodigo.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.casadocodigo.classes.Calculadora;

public class CalculadoraTest {
	
	@Test
	public void deveSomar1Com1() {
		Calculadora calculadora = new Calculadora();
		assertEquals(2, calculadora.soma(1, 1));
	}
	
	@Test
	public void deveSomarVariosValores() {
		Calculadora calculadora = new Calculadora();
		assertEquals(15, calculadora.soma(1, 2, 3, 4, 5));
	}
	
	@Test
	public void deveCalcularFatorial5() {
		Calculadora calculadora = new Calculadora();
		assertEquals(120, calculadora.fatorial(5));
	}

}
