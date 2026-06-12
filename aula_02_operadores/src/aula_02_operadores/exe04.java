package aula_02_operadores;

import java.util.Scanner;

public class exe04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		float n1, n2, n3, n4;
		
		System.out.print("Digite o 1º valor: ");
		n1 = teclado.nextFloat();
		
		System.out.print("Digite o 2º valor: ");
		n2 = teclado.nextFloat();
		
		System.out.print("Digite o 3º valor: ");
		n3 = teclado.nextFloat();
		
		System.out.print("Digite o 4º valor: ");
		n4 = teclado.nextFloat();

		
		System.out.printf("\n (%.1f * %.1f) - (%.1f * %.1f) = %.1f", n1, n2, n3, n4, ((n1 * n2) - (n3 * n4)));
		
		
		teclado.close();

	}

}
