package aula_06_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> listaCores = new ArrayList<String>();
		
		for (int i = 1; i <= 5; i++) {
			System.out.printf("\nDigite a %dª cor: ", i);
			listaCores.add(teclado.next());
		}
		
		System.out.println("\nListar todas as cores:");
		for ( String cor : listaCores) {
			System.out.println(cor);
		}

		listaCores.sort(null);//ordenar
		System.out.println("\nOrdenar as cores:");
		for ( String cor : listaCores) {
			System.out.println(cor);
		}
		
		
		teclado.close();
	}

}
