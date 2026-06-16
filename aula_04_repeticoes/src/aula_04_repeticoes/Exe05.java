package aula_04_repeticoes;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n1 = 0, somaPositivo = 0;
		
		System.out.println("Soma de números positivos. Digite 0 para sair.");
		
		do {
			System.out.print("Digite um número: ");
			n1 = teclado.nextInt();
			
			if (n1 > 0) {
				somaPositivo += n1;
			}
			
		} while (n1 != 0);
		
		System.out.println("A soma dos números positivos é: " + somaPositivo);
		
		

		teclado.close();

	}

}
