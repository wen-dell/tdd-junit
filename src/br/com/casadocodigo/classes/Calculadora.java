package br.com.casadocodigo.classes;

public class Calculadora {

	public int soma(int i, int j) {
		return i + j;
	}

	public int soma(int... numeros) {
		int soma = 0;
		
		for (int numero : numeros) {
			soma += numero;
		}
		
		return soma;
	}

	public int fatorial(int i) {
		int fatorial = 1;
		
		int n = 1;
		while (n <= i) {
			fatorial *= n;
			n += 1;
		}
		
		return fatorial;
	}

}
