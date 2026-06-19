package avaliacao_19_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {

		ArrayList<Integer> listaNum = new ArrayList<Integer>();
		
		System.out.println("*** Coleção de Números e Análise ***");
		
		//Criando a lista
		listaNum.add(2);
		listaNum.add(5);
		listaNum.add(8);
		listaNum.add(3);
		listaNum.add(10);

		percorre(listaNum); //usando método usando a lista

	}

	//criando o método
	public static void percorre(ArrayList<Integer> listaNum) {

		//inicializando variaveis
		int soma = 0, maiorValor, contador = 0;
		double media;

		//Definindo valor inicial para maior valor
		maiorValor = listaNum.get(0);
		
		//Percorrer lista comparando e somando
		for (int i : listaNum) {
			
			if (i >= maiorValor) {
				maiorValor = i;
				 }


			contador++; //Contando as voltas
			soma += i; //somando

			}

		media = (float) soma / contador; //calculando a média em float

		System.out.printf("\nSoma: %d; | Média: %.1f | Maior valor: %d", soma, media, maiorValor); // Saida

	}

}
