package aula_04_repeticoes;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n1 = 0;
		float soma3 = 0, contador3 = 0;
		
		do {
			System.out.print("Digite um número: ");
			n1 = teclado.nextInt();
			
			if ((n1 != 0) && (n1 % 3 == 0)) {
				soma3 += n1;
				contador3 ++;
			}
			
		} while (n1 != 0);
		

		System.out.printf("\nA média de todos os números múltiplos de 3 é: %.1f", (soma3/contador3));
		
		
		teclado.close();
	}

}
