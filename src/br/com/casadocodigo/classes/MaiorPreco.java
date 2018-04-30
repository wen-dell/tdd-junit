package br.com.casadocodigo.classes;

public class MaiorPreco {

	public double encontra(CarrinhoDeCompras carrinho) {
		if (carrinho.getItens().size() == 0) return 0;
		return carrinho.getItens().get(0).getValorTotal();
	}

}
