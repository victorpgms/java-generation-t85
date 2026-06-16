package aula_04_repeticoes;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int par = 0, impar = 0, numero;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %dº número: ",i);
			numero = teclado.nextInt();
			
			if (numero % 2 == 0) {
				par++;
			} else {
				impar ++;
			}			
			
		}
		
		System.out.printf("\nTotal de números pares: %d", par);
		System.out.printf("\nTotal de números ímpares: %d", impar);

		
		
		teclado.close();
	}

}
