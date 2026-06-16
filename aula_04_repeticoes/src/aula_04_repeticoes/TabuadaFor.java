package aula_04_repeticoes;

import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		
		
		int numero;
		
		System.out.print("Digite um número inteiro");
		numero = teclado.nextInt();
		
		
		
		for(int contador = 1; contador <= 10; contador++) {
			
			System.out.printf("%d x %d = %d\n",numero, contador, numero * contador);		
		}
		
		
		for(int y = 1; y <=10; y++) {
		
			System.out.println("\n************\n");
			for(int i = 1; i <= 10; i++) {
				
				System.out.printf("%d x %d = %d\n",y, i, y * i);		
			}
	}
		
		
		
		
		
		
		teclado.close();

	}

}
