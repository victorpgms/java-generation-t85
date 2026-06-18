package aula_06_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exe04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numeroPesquisa;
		
		Set<Integer> listaIntereiros = new HashSet<Integer>();
		
		listaIntereiros.add(2);
		listaIntereiros.add(5);
		listaIntereiros.add(1);
		listaIntereiros.add(3);
		listaIntereiros.add(4);
		listaIntereiros.add(9);
		listaIntereiros.add(7);
		listaIntereiros.add(8);
		listaIntereiros.add(10);
		listaIntereiros.add(6);
		
		System.out.print("Digite o número que você deseja encontrar: ");
		numeroPesquisa = teclado.nextInt();
		if (listaIntereiros.contains(numeroPesquisa)) {
			System.out.printf("\nO número %d foi localizado!", numeroPesquisa);
		}
		else {
			System.out.printf("\nO número %d não foi encontrado!", numeroPesquisa);
		}
		
		
		
		teclado.close();

	}

}
