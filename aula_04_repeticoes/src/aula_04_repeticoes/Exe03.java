package aula_04_repeticoes;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int idade = 0, maiores21 = 0, maiores50 = 0;
		
		while (idade >= 0) {
			System.out.print("Digite uma idade: ");
			idade = teclado.nextInt();
			
			if (idade >= 21) {
				maiores21 ++;
			} 
			
			if ( idade >= 50) {
				maiores50 ++;
			}
		}
		
		System.out.println("Total de pessoas menores de 21: " + maiores21);
		System.out.println("Total de pessoas maiores de 21: " + maiores50);

		
		
		teclado.close();

	}

}
