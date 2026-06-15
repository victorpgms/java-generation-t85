package aula_03_condicionais;

import java.util.Scanner;

public class PlanoSaudeCasa {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String nome;
		int faixaEtaria;
		
		System.out.print("Digite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("***************************");
		System.out.println("        FAIXA ETÁRIA       ");
		System.out.println("***************************");
		System.out.println(" ");
		System.out.println("1 - de 0 a 10 anos de idade");
		System.out.println("2 - de 11 a 29 anos de idade");
		System.out.println("3 - de 30 a 45 anos de idade");
		System.out.println("4 - de 46 a 59 anos de idade");
		System.out.println("5 - de 60 a 65 anos de idade");
		System.out.println("6 - Maiores de 65");
		System.out.println("");
		System.out.println("***************************");

		
		
		System.out.print("Escolha sua faixa etária: ");
		faixaEtaria = leia.nextInt();
		
		System.out.printf("Nome: %s\n", nome);

		switch (faixaEtaria) {
		case 1: 
			System.out.println("A mensalidade é R$ 100,00");
			break;
		case 2: 
			System.out.println("A mensalidade é R$ 200,00");
			break;
		case 3: 
			System.out.println("A mensalidade é R$ 300,00");
			break;
		case 4: 
			System.out.println("A mensalidade é R$ 500,00");
			break;
		case 5: 
			System.out.println("A mensalidade é R$ 600,00");
			break;
		case 6: 
			System.out.println("A mensalidade é R$ 1000,00");
			break;
		default:
			System.out.println("Opção inválida.");
				
		}
		
		
	}

}
