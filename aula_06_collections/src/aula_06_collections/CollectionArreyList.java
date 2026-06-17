package aula_06_collections;

import java.util.ArrayList;
import java.util.Comparator;

public class CollectionArreyList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(6);
		numeros.add(1);
		
		
		for (int numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.println("O objeto que está presente no índice 3: " + numeros.get(3));
		System.out.println("O objeto que está presente no índice 1: " + numeros.indexOf(1));
		
		numeros.set(3, 25);
		
		System.out.println("O objeto que está presente no índice 3: " + numeros.get(3));
		System.out.println("O objeto que está presente no índice : " + numeros.indexOf(1));
		
		numeros.remove(3);
		
		System.out.println("O objeto que está presente no índice 3: " + numeros.get(3));
		
		numeros.sort(null);
		
		System.out.println("Ordem crescente");
		for (int numero : numeros) {
			System.out.println(numero);
		}
		
		numeros.sort(Comparator.reverseOrder());
		
		System.out.println("Ordem decrescente");
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}

}
