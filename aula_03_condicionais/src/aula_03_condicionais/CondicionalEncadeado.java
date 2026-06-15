package aula_03_condicionais;

import java.util.Scanner;

public class CondicionalEncadeado {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		
		float nota1;
		float nota2;
		
		float media = 0;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 6) {
			System.out.println("Aluno aprovado!");
		} else if (media == 5) {
			System.out.println("Aluno de exame!");
		} else {
			System.out.println("Aluno reprovado!");
		}
		
		leia.close();

	}

}
