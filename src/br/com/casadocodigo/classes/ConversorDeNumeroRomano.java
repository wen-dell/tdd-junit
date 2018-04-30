package br.com.casadocodigo.classes;

import java.util.HashMap;
import java.util.Map;

public class ConversorDeNumeroRomano {

	private static Map<Character, Integer> tabela = new HashMap<Character, Integer>() {
		
		private static final long serialVersionUID = 1L;

		{
			put('I', 1);
			put('V', 5);
			put('X', 10);
			put('L', 50);
			put('C', 100);
			put('D', 500);
			put('M', 1000);
		}
	};

	public int converte(String numero) {
		int acumulador = 0;
		
		for (int i = 0; i < numero.length(); i++) {
			acumulador += tabela.get(numero.charAt(i));
		}
		
		return acumulador;
	}

}
