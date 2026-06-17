package aula_05_array2;

import java.util.Scanner;

public class MatrizRegualar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int matrizInteiros [][] = {
									{10 ,15, 20},
									{ 5 ,55, 60},
									{75 ,80, 85}
									};
		
		double matrizDouble [][] = new double [2][3];
		
		
		//Lê matrizInteiros
		for (int linha = 0; linha < matrizInteiros.length; linha++) {
			for (int coluna = 0; coluna < matrizInteiros[linha].length; coluna ++) {
				System.out.printf("\nmatrizInteiros[%d][%d] = %d", linha, coluna, matrizInteiros[linha][coluna]);
			}
			
		}
		
		
		//Insere dados na matrizDouble
		for (int linha = 0; linha < matrizDouble.length; linha++) {
			for (int coluna = 0; coluna < matrizDouble[linha].length; coluna ++) {
				System.out.printf("\nDigite um númeto para a posição [%d][%d]: ", linha, coluna);
				matrizDouble [linha] [coluna] = leia.nextDouble();
			}
			
		}
		
		// Lê a matrizDouble
		for (int linha = 0; linha < matrizDouble.length; linha++) {
			for (int coluna = 0; coluna < matrizInteiros[linha].length; coluna ++) {
				System.out.printf("\nmatrizDouble[%d][%d] = %.2f", linha, coluna, matrizDouble[linha][coluna]);
			}
			
		}
		
		System.out.println("");
		
		// laço de repetição for Each (Lê todo o array)
		for (double linha[] : matrizDouble) {
			for (double numero : linha) {
				System.out.println(numero);
			}
		}
		

		
		leia.close();
	}

}
