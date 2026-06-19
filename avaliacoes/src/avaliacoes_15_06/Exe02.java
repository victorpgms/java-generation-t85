package avaliacoes_15_06;
import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//DECLARAÇÃO DAS VARIÁVEIS
		String nome;
		float notaFinal;	
		
		
		//ENTRADA DE DADOS
		System.out.println("**** SISTEMA DE DECISÃO DE CLASSIFICAÇÃO ****");
		
		System.out.print("Digite o nome do aluno: ");
		nome = teclado.nextLine();
		
		System.out.print("Digite a nota do aluno: ");
		notaFinal = teclado.nextFloat();
				
		
		//PROCESSAMENTO E SAIDA DE DADOS
		if (notaFinal >= 7) {
			System.out.printf("\nAluno %s - Situação: APROVADO", nome);
		} else if (notaFinal >= 5) {
			System.out.printf("\nAluno %s - Situação: RECUPERAÇÃO", nome);
		} else {
			System.out.printf("\nAluno %s - Situação: REPROVADO", nome);
		}

		
		teclado.close();
	}
}
