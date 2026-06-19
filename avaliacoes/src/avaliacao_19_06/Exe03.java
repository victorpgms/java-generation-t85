package avaliacao_19_06;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		String matrizProdutos [][] = new String [100][3];
		
		int qtdCadastrados = 0; //INDEX DE PRODUTOS CADASTRADOS
		
		
		int op = 0;
		
		do {
			
			//MENU
			System.out.println("");
			System.out.println("*** Controle de Estoque ***");
			System.out.println("");
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Listar produtos");
			System.out.println("3 - Atualizar quantidade de um produto");
			System.out.println("0 - Sair do sistema");
			System.out.println("");
			System.out.print("\nDigite a opção desejada: ");
			op = teclado.nextInt();
			
			switch (op) {
			case 1: {
				
				teclado.nextLine(); // LIMPAR SCANNER
				
				matrizProdutos[qtdCadastrados][0] = String.valueOf(qtdCadastrados);

		        System.out.print("\nDigite o nome do produto: ");
		        matrizProdutos[qtdCadastrados][1] = teclado.nextLine();

		        System.out.print("\nDigite a quantidade do produto: ");
		        matrizProdutos[qtdCadastrados][2] = teclado.nextLine();

		        qtdCadastrados++; //CONTADOR DE PRODUTOS CADASTRADOS

		        System.out.println("\nProduto cadastrado com sucesso!");
				
				break;
			}
			case 2: {
				//ESCREVER PRODUTOS CADASTRADOS
				System.out.println("\nPRODUTOS CADASTRADOS:");
				for (int i = 0; i < qtdCadastrados ; i++) {
					System.out.printf("\nCÓDIGO: %-10s | NOME: %-15s | QUANTIDADE: %-10s", matrizProdutos[i][0], matrizProdutos[i][1], matrizProdutos[i][2]);
				}
				
				System.out.println("");
				
				
				break;
			}
			case 3: {

				System.out.println("\nALTERAR QUANTIDADE DE UM PRODUTO:");
				
				//ESCREVER PRODUTOS CADASTRADOS
				for (int i = 0; i < qtdCadastrados ; i++) {
					System.out.printf("\nCÓDIGO: %-10s | NOME: %-15s | QUANTIDADE: %-10s", matrizProdutos[i][0], matrizProdutos[i][1], matrizProdutos[i][2]);
				}
				
				//LOCALIZAR PRODUTO CADASTRADO PELO INDEX / CÓDIGO
				System.out.printf("");
				System.out.println("\nDigite o código do produto que deseja atualizar a quantidade: ");
				int codProduto = teclado.nextInt();
				teclado.nextLine(); // LIMPAR SCANNER
				
				//ATUALIZAR QUANTIDADE
				System.out.printf("");
				System.out.printf("\nDigite a quantidade atualizada do produto - %s: ", matrizProdutos[codProduto][1]);
				matrizProdutos[codProduto][2] = teclado.nextLine();
				System.out.printf("\nQuantidade atualizada!");
				
				break;
			}
			case 0: {
				
				break;
			}
			
			default:
				System.out.println("Opção inválida.");
				break;
			}
			
			
			
		}while (op != 0);
		
		System.out.println("Sistema finalizado.");
		
		teclado.close();
	}
	
	

}
