package aula_05_array2;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorTamanho = 10;
		int vetor [] = new int [vetorTamanho];
		int soma = 0;
		float media = 0;
		
		//Preencher e calcular elementos
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("\nDigite o elemento do índice [%d]: ", i);
			vetor [i] = leia.nextInt();
			soma += vetor [i]; // soma elementos
		}
		media = (float) soma/vetor.length; //calcula média
		
		//printar elementos nos indices impares
		System.out.println("\nElementos nos índices ímpares");
		for (int i = 1; i < vetor.length; i += 2) {
				System.out.print(vetor [i] + " ");
		}
		
		//printar elementos nos indices pares
		System.out.println("\nElementos nos índices pares");
		for (int i = 0; i < vetor.length; i += 2) {
			System.out.print(vetor [i] + " ");
		}

		
		//printar elementos pares
		System.out.println("\nElementos pares");
		for (int i = 0; i < vetor.length; i ++) {
			
			if (vetor[i] % 2 == 0) {
			System.out.print(vetor [i] + " ");
		
			}
		}
		//printar soma
		System.out.println("\nSoma: \n" + soma);
		
		//printar média
		System.out.printf("Média: \n%.2f", media);
		
		
		
		
		leia.close();

	}

}
