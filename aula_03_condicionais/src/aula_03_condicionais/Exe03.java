package aula_03_condicionais;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		String nome;
		int idade;
		boolean PrimeiraDoacao;
		
		boolean fEtaria1;
		boolean fEtaria2;
		
		System.out.print("Digite o nome do doador: ");
		nome = teclado.nextLine();
		
		System.out.print("Digite a idade do doador: ");
		idade = teclado.nextInt();
		
		System.out.print("Primeira doação de sangue? (true ou false): ");
		PrimeiraDoacao = teclado.nextBoolean();
		
		fEtaria1 = idade >= 18 && idade < 60;
		fEtaria2 = idade >= 60 && idade <= 69;
		
		if (fEtaria1 || (fEtaria2 && !PrimeiraDoacao)) {
			System.out.printf("\n%s está apto(a) para doar sangue!", nome);
		} else {
			System.out.printf("\n%s não está apto(a) para doar sangue!", nome); }

		
		teclado.close();


	}

}
