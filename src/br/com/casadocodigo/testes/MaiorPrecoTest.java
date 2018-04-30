package br.com.casadocodigo.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.casadocodigo.classes.CarrinhoDeCompras;
import br.com.casadocodigo.classes.Item;
import br.com.casadocodigo.classes.MaiorPreco;

public class MaiorPrecoTest {
	
	@Test
	public void deveRetornarZeroSeCarrinhoVazio() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		MaiorPreco algoritmo = new MaiorPreco();
		double valor = algoritmo.encontra(carrinho);
		
		assertEquals(0.0, valor, 0.0001);
	}
	
	@Test
	public void deveRetornarValorDoItemSeCarrinhoCom1Elemento() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		
		MaiorPreco algoritmo = new MaiorPreco();
		double valor = algoritmo.encontra(carrinho);
		
		assertEquals(900.0, valor, 0.0001);
	}

}
