package aula_03_condicionais;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		int produto;
		int quantidade;

		System.out.println("****  Tabela de produtos  ****");
		System.out.println("1 - Cachorro quente - R$ 10,00");
		System.out.println("2 - X-Salada        - R$ 15,00");
		System.out.println("3 - X-Bacon         - R$ 18,00");
		System.out.println("4 - Bauru           - R$ 12,00");
		System.out.println("5 - Refrigerante    - R$  8,00");
		System.out.println("6 - Suco de laranja - R$ 13,00");

		System.out.print("\nDigite o nº do produto desejado: ");
		produto = teclado.nextInt();

		System.out.print("\nDigite a quantidade desejada: ");
		quantidade = teclado.nextInt();
		
		switch (produto) {
			case 1:
				System.out.printf("\nPoduto: Cachorro quente");
				System.out.printf("\nValor total: R$ %.2f", (10.0 * quantidade));
				break;			
			case 2:
				System.out.printf("\nPoduto: X-Salada");
				System.out.printf("\nValor total: R$ %.2f", (15.0 * quantidade));
				break;			
			case 3:
				System.out.printf("\nPoduto: X-Bacon");
				System.out.printf("\nValor total: R$ %.2f", (18.0 * quantidade));
				break;			
			case 4:
				System.out.printf("\nPoduto: Bauru");
				System.out.printf("\nValor total: R$ %.2f", (12.0 * quantidade));
				break;			
			case 5:
				System.out.printf("\nPoduto: Refrigerante");
				System.out.printf("\nValor total: R$ %.2f", (8.0 * quantidade));
				break;			
			case 6:
				System.out.printf("\nPoduto: Suco de laranja");
				System.out.printf("\nValor total: R$ %.2f", (13.0 * quantidade));
				break;			
			default:
				System.out.print("\nPoduto inválido");
				break;			
			
		}
		


		teclado.close();
	}

}
