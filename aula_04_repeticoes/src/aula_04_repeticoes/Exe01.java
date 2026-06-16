package aula_04_repeticoes;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		
		do {
			System.out.println("Informe um intervalo de números, retornarei multiplos de 3 e 5");
			
			System.out.print("Digite o 1º número: ");
			n1 = teclado.nextInt();
			System.out.print("Digite o 2º número: ");
			n2 = teclado.nextInt();
			
			if (n1 >= n2) {
				System.out.println("\nO segundo número deve ser maior que o anterior.");
			}
				
		} while (n1 >= n2);
		
		for (int i = n1; i < n2; i++) {
			
			
			boolean mult = (i%3 == 0) && (i%5 == 0);
			
			if (mult) {
				System.out.printf("\n%d é multiplo de 3 e 5",i);
			}
			
		}
		
		
		teclado.close();
		
		
	}

}
