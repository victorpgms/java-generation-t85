package aula_04_repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int idade, esporte, totalRespostas = 0, somaIdades = 0, futebol = 0, voleiM18 = 0;
		double mediaIdades = 0;
		char continua = 'S';
		
		while (continua == 'S') {
			System.out.println("\n*****************************************");
			System.out.println("*** PESQUISA SOBRE ESPORTES FAVORITOS ***");
			System.out.println("*****************************************");
			System.out.print("\nDigite a sua idade: ");
			idade = teclado.nextInt();
			
			do {
				System.out.println("Escolha seu espote favorito: ");
				System.out.println("1 - Futebol");
				System.out.println("2 - Voleibol");
				System.out.println("3 - Basquetebol");
				System.out.println("4 - Outros");
			
				esporte = teclado.nextInt();
			} while (esporte < 1 || esporte > 4);
				
				
			// ESTATÍSTICAS
			
			totalRespostas ++; //total de pessoas que responderam a pesquisa
			
			somaIdades += idade; //soma total das idades das pessoas que responderam a pesquisa
			
			//Total de possoas que gotam de esporte
			if (esporte == 1) {
				futebol ++;
			}
			
			if (idade > 18 && esporte == 2) {
				voleiM18 ++;
			}
			
			
			do {
				System.out.print("\nDeseja continuar? (S/N) ");
				continua = teclado.next().toUpperCase().charAt(0);
			} while (continua != 'S' && continua != 'N');
			
			

			
			
		}
		
		System.out.println("\n********** SISTEMA  FINALIZADO **********");
		System.out.println("*****************************************");
		
		
		
		mediaIdades = somaIdades / totalRespostas;
		System.out.printf("total de pessoas que gostam de futebol: %d \n", futebol);
		System.out.printf("total de pessoas maiores de idade que gostam de voleibol: %d \n", voleiM18);
		System.out.printf("Média das idades: %.2f \n", mediaIdades);
		System.out.printf("total de pessoas: %d \n", totalRespostas);
		teclado.close();
	}

}
