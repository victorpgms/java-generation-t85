package avaliacao_19_06;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String matrizAlunos [][] = new String [100][3];
		
		int qtdCadastrados = 0;
		float mediaGeral = 0, somaGeral = 0;
		
		
		int op = 0;
		
		do {
			
			//MENU
			System.out.println("");
			System.out.println("*** Cadastro de Alunos ***");
			System.out.println("");
			System.out.println("1 - Cadastrar aluno");
			System.out.println("2 - Listar alunos");
			System.out.println("3 - Calcular média das notas");
			System.out.println("0 - Sair do sistema");
			System.out.println("");
			System.out.print("\nDigite a opção desejada: ");
			op = teclado.nextInt();
			
			switch (op) {
			case 1: {
				
				//CADASTRAR DADOS DOS ALUNOS
				teclado.nextLine(); // LIMPAR SCANNER
				
		        System.out.print("\nDigite o nome do aluno: ");
		        matrizAlunos[qtdCadastrados][0] = teclado.nextLine();

		        System.out.print("\nDigite a idade do aluno: ");
		        matrizAlunos[qtdCadastrados][1] = teclado.nextLine();

		        System.out.print("\nDigite a média do aluno: (de 0 a 10) ");
		        matrizAlunos[qtdCadastrados][2] = teclado.nextLine();

		        qtdCadastrados++;

		        System.out.println("\nAluno cadastrado com sucesso!");

				
				break;
			}
			case 2: {
				//ESCREVER TODOS OS DADOS DOS ALUNOS
				System.out.println("\nALUNOS CADASTRADOS:");
				for (int i = 0; i < qtdCadastrados ; i++) {
					System.out.printf("\nNome: %-15s | Idade: %-15s | Média: %-15s", matrizAlunos[i][0], matrizAlunos[i][1], matrizAlunos[i][2]);
				}
				System.out.println("");
				
				
				break;
			}
			case 3: {

				System.out.println("\nMÉDIA GERAL:");
				
				//TRANSFORMAR STRING PARA FLOAT E SOMAR NOTAS
				for (int i = 0; i < qtdCadastrados ; i++) {
					 somaGeral +=  Float.parseFloat(matrizAlunos[i][2]);
				}
				//ESCREVER E CALCULAR MÉDIA GERAL DOS ALUNOS
				System.out.printf("\nMédia geral da turma: %.1f\n",somaGeral/qtdCadastrados);
				
				
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
