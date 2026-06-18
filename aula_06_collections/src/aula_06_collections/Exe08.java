package aula_06_collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Exe08 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int op = 0;

		Deque<String> pilhaLivros = new ArrayDeque<String>();


		do {

			System.out.println("*****************************************");
			System.out.println("");
			System.out.println("1 - Adicionar livro na pilha\n" + "2 - Listar todos os Livros\n"
					+ "3 - Retirar livro da pilha\n" + "0 - Sair");
			System.out.println("");
			System.out.println("*****************************************");
			System.out.print("\nEntre com a opção desejada: ");
			op = teclado.nextInt();
			teclado.nextLine();

			switch (op) {

			case 1: {
				System.out.print("\nDigite o nome: ");
				pilhaLivros.push(teclado.nextLine());
			}

				System.out.println("\nPilha: ");
				for (String livro : pilhaLivros) {
					System.out.println("- " + livro);
				}

				System.out.println("\nLivro adicionado!\n");

				break;

			case 2: {
				if (!pilhaLivros.isEmpty()) {
					System.out.println("\nPilha: ");
					for (String livro : pilhaLivros) {
						System.out.println("- " + livro);
					}
				} else {
					System.out.println("A Pilha está vazia!");
				}
				System.out.println("");
				break;
			}
			case 3:
				if (!pilhaLivros.isEmpty()) {

					String suaVez = pilhaLivros.pop();

					System.out.println("\nPilha: ");
					for (String livro : pilhaLivros) {
						System.out.println("- " + livro);
					}
					System.out.println("");
					System.out.printf("\nLivro foi retirado: %s\n", suaVez);

				} else {
					System.out.println("\nA Pilha está vazia!");
				}
				System.out.println("");
				break;

			default:
				break;
			}

		} while (op != 0);

		System.out.println("\nPrograma finalizado!");

		teclado.close();

	}

}
