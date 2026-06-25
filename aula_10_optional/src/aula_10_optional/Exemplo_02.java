package aula_10_optional;

import java.util.Optional;

public class Exemplo_02 {

	public static void main(String[] args) {

		String frases[] = new String[5];
		
		frases[2] = "Generation Brasil";
		
		for (var frase : frases) {
			System.out.println(frase);
		}
		
		// Optional Vazil
		Optional <String> optionalVazio = Optional.empty();
		System.out.println(optionalVazio);
		System.out.println(optionalVazio.isEmpty());
		
		// Optional com dados
		Optional<String> ValorIndice2 = Optional.of(frases[2]);
		System.out.println("Exibir o valor de valorIndice2: " + ValorIndice2);
		System.out.println("Tem alguma coisa no valorIndice2: " + ValorIndice2.isPresent());
		System.out.println("Qual é o valor armazenado em valorIndice2: " + ValorIndice2.get());
		
	}

}
