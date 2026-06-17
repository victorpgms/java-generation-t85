package aula_05_array2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		// vetor inicialzado com dados
		int vetorInteiros [] = {10, 20, 70,45, 78, 100, 35, 70};
		
		// vetor inicialzado vazio
		float vetorReal [] = new float [5];
		
		// Listar todos os dados do vetor de inteiros
		for (int contador = 0; contador < vetorInteiros.length; contador ++) {
			System.out.printf("vetorInteiros[%d] = %d\n", contador, vetorInteiros[contador]);
		}
		
		System.out.println("Tamanho do Vetor de inteiros:  " + vetorInteiros.length);
		
		// Inserir os dados do vetor de Real
		for (int contador = 0; contador < vetorReal.length; contador ++) {
			System.out.printf("\nDigite um valor real para o indice %d: ", contador);
			vetorReal[contador] = leia.nextFloat();
		}
		
		//ordenar dados
		Arrays.sort(vetorReal);
		
		// Listar todos os dados do vetor de Real
		for (int contador = 0; contador < vetorReal.length; contador ++) {
			System.out.printf("vetorReal[%d] = %f\n", contador, vetorReal[contador]);
		}

		// Listar todos os dados do vetor de Real (De trás para frente)
		for (int contador = vetorReal.length -1; contador >= 0 ; contador --) {
			System.out.printf("vetorReal[%d] = %f\n", contador, vetorReal[contador]);
		}
		
		
		System.out.println("Tamanho do Vetor de Real:  " + vetorReal.length);
		
		System.out.println("Qual é o indice do valor 10 no vetor de reais? " + Arrays.binarySearch(vetorReal, 10));
		
	
		leia.close();
	
	}

}
