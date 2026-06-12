package aula_02_operadores;

import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		
		float media;
		
		System.out.print("Digite a 1ª nota: ");
		nota1 = teclado.nextFloat();
		
		System.out.print("Digite a 2ª nota: ");
		nota2 = teclado.nextFloat();
		
		System.out.print("Digite a 3ª nota: ");
		nota3 = teclado.nextFloat();
		
		System.out.print("Digite a 4ª nota: ");
		nota4 = teclado.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("\nA média das notas é igual a: %.1f", media);
		
		

		teclado.close();
		

	}

}
