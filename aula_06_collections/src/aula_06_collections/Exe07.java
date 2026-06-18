package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Exe07 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int op = 0;

		Queue<String> filaClientes = new LinkedList<String>();

		do {

			System.out.println("*****************************************");
			System.out.println("");
			System.out.println(""
					+ "1 - Adicionar Cliente na Fila\n" 
					+ "2 - Listar todos os Clientes\n"
					+ "3 - Retirar Clientes da Fila\n" 
					+ "0 - Sair");
			System.out.println("");
			System.out.println("*****************************************");
			
			//entrada de dados
			System.out.print("\nEntre com a opção desejada: ");
			op = teclado.nextInt();
			teclado.nextLine(); //limpar scanner

			switch (op) {

			case 1: {
				System.out.print("\nDigite o nome: ");
				filaClientes.add(teclado.nextLine());

				System.out.println("\nFila: ");
				for (String cliente : filaClientes) {
					System.out.println("- " + cliente);
				}
				
				System.out.println("\nCliente adicionado!\n");

				break;
			}

			case 2: {
				if (!filaClientes.isEmpty()) {
					System.out.println("\nFila: ");
					for (String cliente : filaClientes) {
						System.out.println("- " + cliente);
					}
				} else {
					System.out.println("A Fila está vazia!");
				}
				System.out.println("");
				break;
			}
			case 3:
				if (!filaClientes.isEmpty()) {

					String suaVez = filaClientes.remove();

					System.out.println("\nFila: ");
					for (String cliente : filaClientes) {
						System.out.println("- " + cliente);
					}
					System.out.println("");
					System.out.printf("\nCliente foi chamado: %s\n", suaVez);

				} else {
					System.out.println("\nA Fila está vazia!");
				}
				System.out.println("");
				break;

			}

		} while (op != 0);

		System.out.println("\nPrograma finalizado!");

		teclado.close();

	}

}
