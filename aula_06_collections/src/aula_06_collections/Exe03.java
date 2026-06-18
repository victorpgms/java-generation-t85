package aula_06_collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		Set<Integer> listarNumeros = new HashSet<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %dº valor: ",i);
			numero = teclado.nextInt();
			listarNumeros.add(numero);
		}
		
		System.out.println("\nListar dados do Set: ");
		for (int i : listarNumeros) {
			System.out.println(i);
		}
		
		
		
		teclado.close();
	}

}
